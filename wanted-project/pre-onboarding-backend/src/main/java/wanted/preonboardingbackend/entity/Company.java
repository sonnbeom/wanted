package wanted.preonboardingbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity(name = "company")
@Getter
public class Company {
    @Id
    @Column(name = "company_id")
    private String Id;
    @Column(name = "country")
    private String country;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "region")
    private String region;
}
