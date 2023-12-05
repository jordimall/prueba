/**
 * 
 */
package com.pruebatecnica.www.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.www.dto.Message;

/**
 * 
 */
public interface IMessageDAO extends JpaRepository<Message, Long> {

	List<Message> findByPartyId(Long id);
}
