package br.com.mbs.dslist.services;

import br.com.mbs.dslist.dto.GameMinDto;
import br.com.mbs.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        return gameRepository.findAll().stream()
                .map(GameMinDto::new)
                .toList();
    }
}
