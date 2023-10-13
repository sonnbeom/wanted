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
    public List<Integer> readIdListByCompanyId(String companyId){
        return postingIdListRepository.findPostingIdListByCompanyId(companyId);
    }

    public void insertPostIdList(Posting savedPosting) {
        PostingIdList list = createIdList(savedPosting);
        postingIdListRepository.save(list);
    }
    private PostingIdList createIdList(Posting posting){
        int postingId = posting.getId();
        String companyId = posting.getCompany().getId();
        PostingIdList list = new PostingIdList(postingId, companyId);
        return list;
    }
}
