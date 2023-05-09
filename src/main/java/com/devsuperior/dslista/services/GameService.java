package com.devsuperior.dslista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslista.dto.GameMinDTO;
import com.devsuperior.dslista.entities.Game;
import com.devsuperior.dslista.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return  result.stream().map(x -> new GameMinDTO(x)).toList();

	}
}
