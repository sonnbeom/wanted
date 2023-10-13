package wanted.preonboardingbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wanted.preonboardingbackend.entity.Apply;

@Repository
public interface ApplyRepository extends JpaRepository<Apply, Integer> {
    Apply save(Apply apply);
}
