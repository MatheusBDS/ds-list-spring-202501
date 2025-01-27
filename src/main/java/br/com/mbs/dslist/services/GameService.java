package br.com.mbs.dslist.services;

import br.com.mbs.dslist.dto.GameDto;
import br.com.mbs.dslist.dto.GameMinDto;
import br.com.mbs.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        return gameRepository.findAll().stream()
                .map(GameMinDto::new)
                .toList();
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id) {
        return new GameDto(gameRepository.findById(id).get());
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId) {
        return gameRepository.searchGameList(listId).stream().map(GameMinDto::new).toList();
    }
}
