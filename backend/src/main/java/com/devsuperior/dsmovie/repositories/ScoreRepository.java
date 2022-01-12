package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.ScorePK;
/* Controlador REST*/
import com.devsuperior.dsmovie.entities.User;
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	

}
