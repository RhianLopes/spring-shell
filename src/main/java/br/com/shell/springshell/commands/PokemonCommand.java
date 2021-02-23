package br.com.shell.springshell.commands;

import br.com.shell.springshell.service.pokemon.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@ShellCommandGroup("Pokemon")
@RequiredArgsConstructor
public class PokemonCommand {

    private final PokemonService pokemonService;

    @ShellMethod("List pokemon")
    public String list() {
        return pokemonService.list();
    }
}
