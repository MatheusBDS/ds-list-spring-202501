package br.com.mbs.dslist.dto;

import br.com.mbs.dslist.entities.GameList;

public class GameListDto {

    private Long id;
    private String name;

    public GameListDto() {
    }

    public GameListDto(GameList gameList) {
        id = gameList.getId();
        name = gameList.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
