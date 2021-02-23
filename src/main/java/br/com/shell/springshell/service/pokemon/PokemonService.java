package br.com.shell.springshell.service.pokemon;

import br.com.shell.springshell.dto.ListPokemonResponseDto;

import java.util.List;

public interface PokemonService {

    List<ListPokemonResponseDto> list();

}
