package wanted.preonboardingbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Member")
@NoArgsConstructor
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "pwd")
    private String pwd;
    @Column(name = "applied")
    private boolean applied;
    public boolean isApplied(){
        return applied;
    }
}
