package wanted.preonboardingbackend.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostingIdListDto {

    private int id;

    private String companyId;

    private int posting_id;

}
