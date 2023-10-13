package wanted.preonboardingbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wanted.preonboardingbackend.entity.Posting;
import wanted.preonboardingbackend.entity.PostingIdList;
import wanted.preonboardingbackend.repository.PostingIdListRepository;

import java.util.List;

@Service
public class IdListService {
    @Autowired
    PostingIdListRepository postingIdListRepository;
    @Autowired
    PostingService postingService;

    public List<Integer> readIdListByCompanyId(String companyId) {
        return postingIdListRepository.findPostingIdListByCompanyId(companyId);
    }

    public void insertPostIdList(Posting savedPosting) {
        PostingIdList list = createIdList(savedPosting);
        postingIdListRepository.save(list);
    }

    private PostingIdList createIdList(Posting posting) {
        int postingId = posting.getId();
        String companyId = posting.getCompany().getId();
        PostingIdList list = new PostingIdList(postingId, companyId);
        return list;
    }
    private List<Integer> removeId(List<Integer> list, int postingId) {
        list.removeIf(id -> id.equals(postingId));
        return list;
    }
    public List<Integer> readIdList(int postingId, String companyId) {
        List<Integer> listBfRemove = readIdListByCompanyId(companyId);
        return removeId(listBfRemove, postingId);
    }

}
