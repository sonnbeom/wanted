package wanted.preonboardingbackend.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import wanted.preonboardingbackend.dto.ListPostingDto;
import wanted.preonboardingbackend.dto.PostingDto;
import wanted.preonboardingbackend.dto.PostingUpdateDto;
import wanted.preonboardingbackend.entity.Company;
import wanted.preonboardingbackend.entity.Posting;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemoryPostingRepository extends JpaRepository<Posting, Integer> {


    Posting save(Posting posting);
    Optional<Posting> findByCompanyId(String companyId);
    Optional<Posting> findById(int id);
    Optional<PostingUpdateDto>findPostDtoById(int postId);
    void deleteById(int id);
}
