/**
 * 
 */
package com.pruebatecnica.www.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.www.dto.Message;

/**
 * 
 */
public interface IMessageDAO extends JpaRepository<Message, Long> {

}
