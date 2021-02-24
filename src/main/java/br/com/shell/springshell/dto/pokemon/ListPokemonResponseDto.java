package br.com.shell.springshell.dto.pokemon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListPokemonResponseDto {

    private List<ListPokemonResultResponseDto> results;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ListPokemonResultResponseDto {

        private String name;

        private String url;

    }

}
