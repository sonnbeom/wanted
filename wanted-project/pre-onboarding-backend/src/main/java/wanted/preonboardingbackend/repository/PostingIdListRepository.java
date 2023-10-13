package wanted.preonboardingbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import wanted.preonboardingbackend.entity.PostingIdList;

import java.util.List;
@Repository
public interface PostingIdListRepository extends JpaRepository<PostingIdList, Integer> {

    @Query("SELECT p.posting_id FROM posting_id_list p WHERE p.companyId = :companyId")
    List<Integer> findPostingIdListByCompanyId(@Param("companyId") String companyId);
    PostingIdList save(PostingIdList postingIdList);
}
