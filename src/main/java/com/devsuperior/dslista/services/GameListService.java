package com.devsuperior.dslista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslista.dto.GameListDTO;
import com.devsuperior.dslista.entities.GameList;
import com.devsuperior.dslista.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return  result.stream().map(x -> new GameListDTO(x)).toList();

	}
}
