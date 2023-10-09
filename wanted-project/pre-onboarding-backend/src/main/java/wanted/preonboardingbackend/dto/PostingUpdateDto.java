package wanted.preonboardingbackend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostingUpdateDto {
    @NotBlank
    private String position;
    @NotBlank
    private int pay;
    @NotBlank
    private String technology;
    @NotBlank
    private String content;
}
