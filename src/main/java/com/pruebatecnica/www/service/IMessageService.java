/**
 * 
 */
package com.pruebatecnica.www.service;

import java.util.List;

import com.pruebatecnica.www.dto.Message;

/**
 * 
 */
public interface IMessageService {

	/**
	 * Deveuelve todos los IMessageServices
	 * 
	 * @return List<Message>
	 */
	public List<Message> getAllByMessage(Long id);

	/**
	 * Devuelve un IMessageService en especifico
	 * 
	 * @param id
	 * @return IMessageService
	 */
	public Message getId(Long id);

	/**
	 * Añade un IMessageService a la base de datos
	 * 
	 * @param IMessageService
	 * @return IMessageService
	 */
	public Message add(Message message);

	/**
	 * Actualiza un IMessageService
	 * 
	 * @param IMessageService
	 * @return IMessageService
	 */
	public Message update(Message message);

	/**
	 * Elimina un IMessageService
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
