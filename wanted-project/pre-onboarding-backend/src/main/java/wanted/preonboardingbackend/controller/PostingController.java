package wanted.preonboardingbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import wanted.preonboardingbackend.dto.ListPostingDto;
import wanted.preonboardingbackend.dto.PostingDetail;
import wanted.preonboardingbackend.dto.PostingDto;
import wanted.preonboardingbackend.dto.PostingUpdateDto;
import wanted.preonboardingbackend.entity.PostList;
import wanted.preonboardingbackend.service.PostingService;

import java.util.List;

@Controller
public class PostingController {
    @Autowired
    PostingService postingService;
    /**
     *
     * @Param BoardFormDto
     * @Param BindingResult
     * @return String
     * @Author sHu
     */
    @PostMapping("/register")
    public String uploadPosting(@ModelAttribute PostingDto postingDto){
        postingService.register(postingDto);
        return "";
    }
    @GetMapping("home")
    public String home(){
        return "home";
    }

    // 1.로그인한 상태에서 스프링 시큐리티를 통해 회사 id를 가져오는 것으로 상황을 가정했습니다. (조건: 로그인 등 사용자 인증절차(토큰 등)는 생략합니다 )
    // 2. 하나의 채용공고를 클릭하여 이를 수정하는 것으로 가정했습니다. 해당 채용공고 내용이 보이고 유저가 전체를 처음부터 입력하는 것이 아니라 수정이 필요한 부분만 수정입력하여 업데이트하는 것으로 가정했습니다.
    // 이에 따라 DB에서 list를 가져오는 것이 아니라 하나의 엔티티만 있다고 가정하여 메소드를 설정했습니다
    @PostMapping("/update")
    public String updatePosting(@ModelAttribute PostingUpdateDto updateDto, @RequestParam String companyId){
        postingService.update(updateDto, companyId);
        return "";
    }
    @GetMapping("/update")
    public String updateTest(){
        return "update";
    }
    //스프링 시큐리티로 해당 회사의 아이디를 확인하는 것으로 가정했습니다.
    @GetMapping("/delete")
    public String deleteTest(){
        return "delete";
    }
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable int id, @RequestParam String companyId){
        postingService.delete(id, companyId);
        return "";
    }
    @GetMapping("/readAll")
    public String readAll(Model model){
        List<PostList> list = postingService.readAll();
        if (list.size() == 0){
            model.addAttribute("message","게시글이 없습니다.");
        }
        model.addAttribute("postinglist", list);
        return "postinglist";
    }
    @GetMapping("/searchtest")
    public String searchTest(){
        return "searchkeyword";
    }
    @GetMapping("/search")
    public String readByKeyword(@RequestParam("search") String keyword, Model model){
        List<PostList> list = postingService.readByKeyword(keyword);
        if (list.size()==0){
            model.addAttribute("message", "해당 검색어로 인한 게시물이 없습니다.");
        }
        model.addAttribute("postinglist", list);
        return "searchresult";
    }
    @GetMapping("/posting/{postingId}")
    public String readOne(@PathVariable int postingId, Model model){
        PostingDetail postingDetail = postingService.readOne(postingId);
        List<Integer> idList = postingService.readIdList(postingId);
        model.addAttribute("postingdetail", postingDetail);
        model.addAttribute("idlist", idList);
        System.out.println("_________--------------id list: "+idList);
        return "postingdetail";
    }
    @GetMapping("list")
    public String readOneTest(){
        return "list";
    }
}
