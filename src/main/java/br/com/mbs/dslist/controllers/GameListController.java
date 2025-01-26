package br.com.mbs.dslist.controllers;

import br.com.mbs.dslist.dto.GameListDto;
import br.com.mbs.dslist.dto.GameMinDto;
import br.com.mbs.dslist.services.GameListService;
import br.com.mbs.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByListId(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}
