package com.devsuperior.dslista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslista.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
