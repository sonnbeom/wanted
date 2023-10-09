package wanted.preonboardingbackend.dto;



import jakarta.validation.constraints.NotBlank;
import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class PostingDto {
   @NotBlank
   private String position;
   @NotBlank
   private String companyId;
   @NotBlank
   private int pay;
   @NotBlank
   private String technology;
   @NotBlank
   private String content;
}
