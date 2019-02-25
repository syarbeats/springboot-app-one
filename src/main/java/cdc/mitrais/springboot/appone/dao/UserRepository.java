package cdc.mitrais.springboot.appone.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cdc.mitrais.springboot.appone.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);
}
