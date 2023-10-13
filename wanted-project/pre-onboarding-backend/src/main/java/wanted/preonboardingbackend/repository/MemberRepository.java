package wanted.preonboardingbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wanted.preonboardingbackend.entity.Member;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {
    Optional<Member>findById(int id);
}
