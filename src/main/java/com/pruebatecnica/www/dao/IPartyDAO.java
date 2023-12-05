/**
 * 
 */
package com.pruebatecnica.www.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.www.dto.Party;

/**
 * 
 */
public interface IPartyDAO extends JpaRepository<Party, Long> {

}
