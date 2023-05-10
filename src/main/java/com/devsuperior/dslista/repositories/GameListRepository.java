package com.devsuperior.dslista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslista.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
