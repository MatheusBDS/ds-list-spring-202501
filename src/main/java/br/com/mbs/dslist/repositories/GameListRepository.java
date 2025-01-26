package br.com.mbs.dslist.repositories;

import br.com.mbs.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
