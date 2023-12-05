/**
 * 
 */
package com.pruebatecnica.www.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.www.dao.IMessageDAO;
import com.pruebatecnica.www.dto.Message;
import com.pruebatecnica.www.service.IMessageService;

/**
 * 
 */
@Service
public class MessageServiceImpl implements IMessageService {

	@Autowired
	IMessageDAO daoMessage;

	/**
	 * Deveuelve todos los messages
	 * 
	 * @return List<Message>
	 */
	public List<Message> getAllByMessage(Long id) {
		return daoMessage.findByPartyId(id);
	}

	/**
	 * Devuelve un message en especifico
	 * 
	 * @param id
	 * @return Message
	 */
	public Message getId(Long id) {
		return daoMessage.findById(id).get();
	}

	/**
	 * Añade un message a la base de datos
	 * 
	 * @param message
	 * @return Message
	 */
	public Message add(Message message) {
		return daoMessage.save(message);
	}

	/**
	 * Actualiza un message
	 * 
	 * @param message
	 * @return Message
	 */
	public Message update(Message message) {
		return daoMessage.save(message);
	}

	/**
	 * Elimina un message
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		daoMessage.deleteById(id);
	}
}
