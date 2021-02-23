package br.com.shell.springshell.service.pokemon;

import br.com.shell.springshell.dto.ListPokemonResponseDto;
import br.com.shell.springshell.feign.PokeApiClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private final PokeApiClient pokeApiClient;

    @Override
    public String list() {
        final ListPokemonResponseDto listPokemonResponseDto = pokeApiClient.listPokemon();
        return gson.toJson(listPokemonResponseDto.getResults());
    }
}
