package wanted.preonboardingbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wanted.preonboardingbackend.repository.ApplyRepository;

@Service
public class ApplyService {
    @Autowired
    ApplyRepository applyRepository;

    public void insert(String userId, int postingId) {
        if (applyCheck(userId)){

        }
    }

    private boolean applyCheck(String userId) {

    }
}
