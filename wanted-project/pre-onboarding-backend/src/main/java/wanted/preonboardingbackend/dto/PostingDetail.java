package wanted.preonboardingbackend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
public class PostingDetail {
    private int posting_id;
    private String companyName;
    private String country;
    private String region;
    private String position;
    private int pay;
    private String technology;
    private String content;

    public PostingDetail(int posting_id, String companyName, String country, String region, String position, int pay, String technology, String content) {
        this.posting_id = posting_id;
        this.companyName = companyName;
        this.country = country;
        this.region = region;
        this.position = position;
        this.pay = pay;
        this.technology = technology;
        this.content = content;
    }
}

