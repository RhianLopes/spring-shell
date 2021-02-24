package br.com.shell.springshell.dto.pokemon;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchPokemonResponseDto {

    private String id;

    private String name;

    private Integer height;

    private Integer weight;

    @JsonAlias(value = "base_experience")
    private Integer baseExperience;

}
