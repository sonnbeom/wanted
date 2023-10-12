package wanted.preonboardingbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import wanted.preonboardingbackend.entity.PostList;

import java.util.List;
@Repository
public interface PostListRepository extends JpaRepository<PostList, Integer> {
    List<PostList> findAll();

    @Query("SELECT p FROM post_list p WHERE " +
            "p.companyName LIKE %:keyword% OR " +
            "p.country LIKE %:keyword% OR " +
            "p.region LIKE %:keyword% OR " +
            "p.position LIKE %:keyword% OR " +
            "p.technology LIKE %:keyword%"
    )
    List<PostList> findByKeyword(@Param("keyword") String keyword);
}


