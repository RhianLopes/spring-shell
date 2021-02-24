package br.com.shell.springshell.service.pokemon;

import br.com.shell.springshell.dto.pokemon.ListPokemonResponseDto;
import br.com.shell.springshell.feign.PokeApiClient;
import br.com.shell.springshell.helper.JsonHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService {

    private final PokeApiClient pokeApiClient;

    @Override
    public String list() {
        final ListPokemonResponseDto listPokemonResponseDto = pokeApiClient.listPokemon();
        return JsonHelper.toJson(listPokemonResponseDto.getResults());
    }

    @Override
    public String searchByName(String name) {
        return JsonHelper.toJson(pokeApiClient.searchByName(name));
    }
}
