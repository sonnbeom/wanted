package wanted.preonboardingbackend.postTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wanted.preonboardingbackend.repository.PostingRepository;
import wanted.preonboardingbackend.service.PostingService;

@SpringBootTest
public class InsertPostTest {
    @Autowired
    PostingService postingService;
    @Autowired
    PostingRepository postingRepository;
    void insertTest(){

    }

}
