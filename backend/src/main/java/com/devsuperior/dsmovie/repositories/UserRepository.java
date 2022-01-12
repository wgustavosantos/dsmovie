package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.User;
/* Controlador REST*/
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email); /* Busca no banco de dados por email *JPA repository/Interface SPRING  **/

}
