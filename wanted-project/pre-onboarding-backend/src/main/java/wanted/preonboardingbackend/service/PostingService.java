package wanted.preonboardingbackend.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wanted.preonboardingbackend.dto.ListPostingDto;
import wanted.preonboardingbackend.dto.PostingDetail;
import wanted.preonboardingbackend.dto.PostingDto;
import wanted.preonboardingbackend.dto.PostingUpdateDto;
import wanted.preonboardingbackend.entity.Company;
import wanted.preonboardingbackend.entity.PostList;
import wanted.preonboardingbackend.entity.Posting;
import wanted.preonboardingbackend.entity.PostingIdList;
import wanted.preonboardingbackend.exception.NotFoundException;
import wanted.preonboardingbackend.repository.MemoryCompanyRepository;
import wanted.preonboardingbackend.repository.MemoryPostingRepository;
import wanted.preonboardingbackend.repository.PostListRepository;
import wanted.preonboardingbackend.repository.PostingIdListRepository;


import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

@Service
public class PostingService {
    @Autowired
    MemoryPostingRepository memoryPostingRepository;
    @Autowired
    MemoryCompanyRepository memoryCompanyRepository;
    @Autowired
    CompanyService companyService;
    @Autowired
    PostListRepository postListRepository;




    @Transactional
    public Posting register(PostingDto postingDto) {
        Company company = findByCompanyId(postingDto.getCompanyId());
        Posting posting = new Posting(postingDto,company);
        return memoryPostingRepository.save(posting);
    }

    private Company findByCompanyId(String companyId){
        return companyService.findById(companyId);
    }

    //안 쓰는 건 이유가 있다 리플렉셔 확인

    private Posting setUpdatePosting(PostingUpdateDto postingUpdateDto, Posting existingPosting){
        Field[] fields = PostingUpdateDto.class.getDeclaredFields();
        //dto의 필드를 배열 형태로 가져옴
        //배열 형태로 존재하는 필드를 단일 필드로 할당함
        for (Field field:fields) {
            try {
                field.setAccessible(true);
                Object value = field.get(postingUpdateDto);
                //field.get(객체)를 넣으면 해당 객체의 필드에 해당하는 값을 가져올 수 있다
                if (value == null){
                    throw new IllegalArgumentException(field.getName()+ "is null");
                }if (!field.getName().equals("companyId")){
                    Field existingField = existingPosting.getClass().getDeclaredField(field.getName());
                    //해당 클래스의 들어가 getDeclaredField();을 호출 괄호 안에 필드의 이름을 넣으면
                    //필드값으로 해당 필드값 반환
                    existingField.setAccessible(true);
                    existingField.set(existingPosting,value);
                    existingField.setAccessible(false);
                }

            }catch (IllegalAccessException e){
                e.printStackTrace();;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            } finally {
                field.setAccessible(false);
            }
        }
        return existingPosting;
    }
    private Posting checkPosting(String companyID){
        return memoryPostingRepository.findByCompanyId(companyID)
                .orElseThrow(()->new NotFoundException("Posting not found by company id: "+ companyID));
    }
    @Transactional
    public void update(PostingUpdateDto updateDto, String companyId) {
        Posting existingposting = checkPosting(companyId);
        Posting posting =  setUpdatePosting(updateDto, existingposting);
        memoryPostingRepository.save(posting);
    }
    @Transactional
    public void delete(int id, String companyId) {
        Posting posting = findByPostingId(id);
        if (checkAuthority(companyId,posting)){
            memoryPostingRepository.deleteById(id);
        }
    }

    public Posting findByPostingId(int id){
        return memoryPostingRepository.findById(id)
                .orElseThrow(()->new NotFoundException("Posting not found by post id: "+id));
    }

    private boolean checkAuthority(String companyId, Posting posting){
        if (posting.getCompany().getId().equals(companyId)){
            return true;
        } throw new NotFoundException("Posting not found by company id:"+companyId);
    }
        private boolean checkAuthority(String companyId, PostingDto dto){
        if (dto.getCompanyId().equals(companyId)){
            return true;
        } throw new NotFoundException("Posting not found by company id:"+companyId);
    }
    @Transactional
    public List<PostList> readAll() {
        //게시글이 없을 땐 어떻게 하지
        List<PostList> postList = postListRepository.findAll();
        return postList;
    }

    public List<PostList> readByKeyword(String keyword) {
        return postListRepository.findByKeyword(keyword);
    }
    @Transactional
    public PostingDetail readOne(int postingId) {
        PostingDetail postingDetail = memoryPostingRepository.readOne(postingId);
        if (postingDetail==null){
            throw new NotFoundException("해당 posting id로는 posting을 조회할 수 없습니다."+ postingId);
        }
        return postingDetail;
    }
    public String findCompanyId(int postingId){
        Posting posting = findByPostingId(postingId);
        return posting.getCompany().getId();
    }
}
















//    public static void checkNull(PostingDto postingDto) {
//        if (postingDto == null) {
//            throw new IllegalArgumentException("postingDto cannot be null");
//        }
//
//        if (postingDto.getPay() == null) {
//            throw new IllegalArgumentException("pay cannot be null");
//        }
//
//        if (postingDto.getText() == null) {
//            throw new IllegalArgumentException("text cannot be null");
//        }
//
//        if (postingDto.getPosition() == null) {
//            throw new IllegalArgumentException("position cannot be null");
//        }
//
//        if (postingDto.getContent() == null) {
//            throw new IllegalArgumentException("content cannot be null");
//        }
//
//        if (postingDto.getTechnology() == null) {
//            throw new IllegalArgumentException("technology cannot be null");
//        }
//    }
//public PostingDto setUpdateDto(PostingDto targetDto, PostingDto postingDto) {
//    checkNull(postingDto);
//
//    targetDto.setPay(postingDto.getPay());
//    targetDto.setText(postingDto.getText());
//    targetDto.setPosition(postingDto.getPosition());
//    targetDto.setContent(postingDto.getContent());
//    targetDto.setTechnology(postingDto.getTechnology());
//
//    return targetDto;
//} 필드의 갯수만큼 get을 쓰고 그 get이 null이

//    public PostingDto setUpdateDto(PostingDto targetDto, PostingDto postingDto) {
//
////        checkNull(postingDto.getPay(),"pay");
////        checkNull(postingDto.getText(), "text");
////        checkNull();
////        checkNull();
////        checkNull();
//
//        targetDto.setPay(postingDto.getPay());
//        targetDto.setText(postingDto.getText());
//        targetDto.setPosition(postingDto.getPosition());
//        targetDto.setContent(postingDto.getContent());
//        targetDto.setTechnology(postingDto.getTechnology());
//        return targetDto;
//    }