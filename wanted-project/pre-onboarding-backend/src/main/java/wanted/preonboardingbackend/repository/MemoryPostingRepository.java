package wanted.preonboardingbackend.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import wanted.preonboardingbackend.dto.ListPostingDto;
import wanted.preonboardingbackend.dto.PostingDetail;
import wanted.preonboardingbackend.dto.PostingDto;
import wanted.preonboardingbackend.dto.PostingUpdateDto;
import wanted.preonboardingbackend.entity.Company;
import wanted.preonboardingbackend.entity.Posting;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemoryPostingRepository extends JpaRepository<Posting, Integer> {

    @Query("SELECT new wanted.preonboardingbackend.dto.PostingDetail(p.id, c.companyName, c.country, c.region, p.position, p.pay, p.technology, p.content) " +
            "FROM posting p " +
            "JOIN p.company c " +
            "WHERE p.id = :postingId")

    PostingDetail readOne(@Param("postingId") int postingId);
    Posting save(Posting posting);
    Optional<Posting> findByCompanyId(String companyId);
    Optional<Posting> findById(int id);
    Optional<PostingUpdateDto>findPostDtoById(int postId);
    void deleteById(int id);


}
