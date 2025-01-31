package com.tavrod.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tavrod.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
