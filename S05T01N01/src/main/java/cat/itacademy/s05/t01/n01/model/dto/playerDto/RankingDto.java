package cat.itacademy.s05.t01.n01.model.dto.playerDto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RankingDto {
    @NotEmpty(message = "Player must have a  valid name.")
    private String name;
    private int wins;
}