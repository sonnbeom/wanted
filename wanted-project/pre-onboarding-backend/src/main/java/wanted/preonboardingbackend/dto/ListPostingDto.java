package wanted.preonboardingbackend.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ListPostingDto {
    private int id;
    private String companyName;
    private String country;
    private String region;
    private String position;
    private int pay;
    private String technology;

    public ListPostingDto(int id, String companyName, String country, String region, String position, int pay, String technology) {
        this.id = id;
        this.companyName = companyName;
        this.country = country;
        this.region = region;
        this.position = position;
        this.pay = pay;
        this.technology = technology;
    }
}
