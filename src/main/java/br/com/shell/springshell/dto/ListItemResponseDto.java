package br.com.shell.springshell.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListItemResponseDto {

    private List<ListItemResultResponseDto> results;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ListItemResultResponseDto {

        private String name;

        private String url;

    }

}
