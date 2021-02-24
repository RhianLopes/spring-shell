package br.com.shell.springshell.commands;

import br.com.shell.springshell.service.item.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@ShellCommandGroup("Item")
@RequiredArgsConstructor
public class ItemCommand {

    private final ItemService itemService;

    @ShellMethod("List items")
    public String listItems() {
        return itemService.list();
    }
}
