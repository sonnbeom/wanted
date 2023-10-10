package wanted.preonboardingbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wanted.preonboardingbackend.dto.PostingDto;
import wanted.preonboardingbackend.entity.Company;
import wanted.preonboardingbackend.entity.Posting;

import java.util.Optional;

@Repository
public interface MemoryPostingRepository extends JpaRepository<Posting, Integer> {
    Posting save(Posting posting);
    Optional<Posting> findByCompanyId(String companyId);
    Optional<Posting> findById(int id);
    void deleteById(int id);
}
