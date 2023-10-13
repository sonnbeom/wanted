package wanted.preonboardingbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity(name = "posting_id_list")
public class PostingIdList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "posting_id_list_id")
    private int id;
    @Column(name = "company_id")
    private String companyId;
    @Column(name = "posting_id" )
    private int posting_id;
    public PostingIdList(int posting_id, String companyId){
        this.posting_id = posting_id;
        this.companyId = companyId;
    }
}
