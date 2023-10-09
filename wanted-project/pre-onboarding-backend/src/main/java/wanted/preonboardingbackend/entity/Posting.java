package wanted.preonboardingbackend.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import wanted.preonboardingbackend.dto.PostingDto;

@Entity(name = "posting")
@Getter
@NoArgsConstructor
public class Posting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "posting_id")
    private int id;
    @Column(name = "position", nullable = false)
    private String position;
    @Column(name = "company_id", nullable = false)
    private String companyId;
    @Column(name = "pay", nullable = false)
    private int pay;
    @Column(name = "content", nullable = false)
    private String content;
    @Column(name = "technology", nullable = false)
    private String technology;

    public Posting(PostingDto postingDto){
        this.companyId = postingDto.getCompanyId();
        this.position = postingDto.getPosition();
        this.pay = postingDto.getPay();
        this.content = postingDto.getContent();
        this.technology = postingDto.getTechnology();
    }
}
