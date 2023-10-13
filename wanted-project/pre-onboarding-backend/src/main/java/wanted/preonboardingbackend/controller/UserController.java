package wanted.preonboardingbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import wanted.preonboardingbackend.service.ApplyService;
import wanted.preonboardingbackend.service.MemberService;

@Controller
public class UserController {
    @Autowired
    ApplyService applyService;
    @Autowired
    MemberService memberService;
    //스프링 시큐리티를 통해 userId를 가져온다고 가정했습니다.
    @PostMapping("/posting/{postingId}/apply")
    public String userApply(@PathVariable int postingId, @RequestParam int id){
        memberService.checkApply(id);
        applyService.insert(userId, postingId);
        return "";
    }
}
