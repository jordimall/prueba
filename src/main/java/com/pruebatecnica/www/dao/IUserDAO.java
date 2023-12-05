/**
 * 
 */
package com.pruebatecnica.www.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.www.dto.User;

/**
 * 
 */
public interface IUserDAO extends JpaRepository<User, Long> {

	Optional<User> findByUserName(String userName);
}
