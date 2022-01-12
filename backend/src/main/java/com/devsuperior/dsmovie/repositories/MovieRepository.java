package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;
/* Controlador REST*/
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
