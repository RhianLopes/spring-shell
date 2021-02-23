package br.com.shell.springshell.feign;

import br.com.shell.springshell.dto.ListPokemonResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "poke-api", url = "${spring-shell.poke-api.url}")
public interface PokeApiClient {

    @GetMapping("/pokemon")
    ListPokemonResponseDto listPokemon();

}
