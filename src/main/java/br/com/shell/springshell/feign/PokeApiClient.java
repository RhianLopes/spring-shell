package br.com.shell.springshell.feign;

import br.com.shell.springshell.dto.item.ListItemResponseDto;
import br.com.shell.springshell.dto.pokemon.ListPokemonResponseDto;
import br.com.shell.springshell.dto.pokemon.SearchPokemonResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "poke-api", url = "${spring-shell.poke-api.url}")
public interface PokeApiClient {

    @GetMapping("/pokemon")
    ListPokemonResponseDto listPokemon();

    @GetMapping("/pokemon/{name}")
    SearchPokemonResponseDto searchByName(@PathVariable("name") String name);

    @GetMapping("/item")
    ListItemResponseDto listItem();

}
