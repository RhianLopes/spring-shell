package br.com.shell.springshell.commands;

import br.com.shell.springshell.service.pokemon.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
@ShellCommandGroup("Pokemon")
@RequiredArgsConstructor
public class PokemonCommand {

    private final PokemonService pokemonService;

    @ShellMethod("List pokemon")
    public String listPokemon() {
        return pokemonService.list();
    }

    @ShellMethod("Search Pokemon By Name")
    public String searchByName(@ShellOption(help = "Search your pokemon by name", defaultValue = "bulbasaur") String name) {
        return pokemonService.searchByName(name);
    }
}
