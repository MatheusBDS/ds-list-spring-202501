package br.com.mbs.dslist.controllers;

import br.com.mbs.dslist.dto.GameListDto;
import br.com.mbs.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games-lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll() {
        return gameListService.findAll();
    }
}
