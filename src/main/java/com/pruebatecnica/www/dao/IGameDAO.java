/**
 * 
 */
package com.pruebatecnica.www.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.www.dto.Game;

/**
 * 
 */
public interface IGameDAO extends JpaRepository<Game, Long> {

}
