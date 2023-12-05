/**
 * 
 */
package com.pruebatecnica.www.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.www.dto.User;

/**
 * 
 */
public interface IUserDAO extends JpaRepository<User, Long> {

}
