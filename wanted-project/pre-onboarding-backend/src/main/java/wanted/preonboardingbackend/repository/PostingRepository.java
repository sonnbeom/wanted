//package wanted.preonboardingbackend.repository;
//
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import wanted.preonboardingbackend.dto.ListPostingDto;
//
//import java.util.List;
//@Repository
//public class PostingRepository {
//    @Autowired
//    EntityManager entityManager;
//    public List<ListPostingDto> getAllPostings(){
//
////
////        류명한
////        오후 2:15
////        @Query("SELECT new com.han.dto.PostListResDto(" +
////                "p.id, p.company.name, p.company.country, p.company.city," +
////                "p.position, p.compensation, p.techStack" +
////                ") FROM Post p JOIN p.company
//
//        //TypedQuery<>는 리턴값이 확실할 때 적는다.
//        TypedQuery<ListPostingDto> query =entityManager.createQuery(
//                "SELECT new wanted.preonboardingbackend.dto.PostingDto(" +
//                        "p.position, p.companyId, p.company.country, p.company.region, " +
//                        "p.position, p.pay, p.technology) FROM Posting p JOIN p.company c",
//                ListPostingDto.class);
//
//        return query.getResultList();
//    }
//
//}
