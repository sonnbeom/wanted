package wanted.preonboardingbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wanted.preonboardingbackend.entity.Member;
import wanted.preonboardingbackend.exception.NotFoundException;
import wanted.preonboardingbackend.repository.MemberRepository;

@Service
public class MemberService{
    @Autowired
    MemberRepository memberRepository;


    public void checkApply(int id) {
        Member member = findMemberById(id);
        member.g
    }
    private Member findMemberById(int id){
       return memberRepository.findById(id)
                .orElseThrow(()->new NotFoundException("로그인을 확인하시기 바랍니다."));
    }
}
