/**
 * 
 */
package com.pruebatecnica.www.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.www.dto.Party;

/**
 * 
 */
public interface IPartyDAO extends JpaRepository<Party, Long> {
	
	List<Party> findByGameId(long id);

}
