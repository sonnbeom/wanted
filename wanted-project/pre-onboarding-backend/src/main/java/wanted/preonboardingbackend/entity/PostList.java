package wanted.preonboardingbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "post_list")
@NoArgsConstructor
@Getter
@Table(name = "post_list")
public class PostList {
    @Id
    @Column(name = "posting_id")
    private int id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "country")
    private String country;
    @Column(name = "region")
    private String region;
    @Column(name = "position")
    private String position;
    @Column(name = "pay")
    private int pay;
    @Column(name = "technology")
    private String technology;

}
