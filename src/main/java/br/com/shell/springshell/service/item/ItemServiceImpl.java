package br.com.shell.springshell.service.item;

import br.com.shell.springshell.dto.ListItemResponseDto;
import br.com.shell.springshell.feign.PokeApiClient;
import br.com.shell.springshell.helper.JsonHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final PokeApiClient pokeApiClient;

    @Override
    public String list() {
        final ListItemResponseDto listItemResponseDto = pokeApiClient.listItem();
        return JsonHelper.toJson(listItemResponseDto.getResults());
    }
}
