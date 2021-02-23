package br.com.shell.springshell.service.pokemon;

import br.com.shell.springshell.dto.ListPokemonResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService {

    @Override
    public List<ListPokemonResponseDto> list() {
        return Collections.singletonList(new ListPokemonResponseDto("dilma"));
    }
}
