/**
 * 
 */
package com.pruebatecnica.www.service;

import java.util.List;

/**
 * 
 */
public interface IMessageService {

	/**
	 * Deveuelve todos los IMessageServices
	 * 
	 * @return List<IMessageService>
	 */
	public List<IMessageService> getAllByParty(Long id);

	/**
	 * Devuelve un IMessageService en especifico
	 * 
	 * @param id
	 * @return IMessageService
	 */
	public IMessageService getId(Long id);

	/**
	 * Añade un IMessageService a la base de datos
	 * 
	 * @param IMessageService
	 * @return IMessageService
	 */
	public IMessageService add(IMessageService IMessageService);

	/**
	 * Actualiza un IMessageService
	 * 
	 * @param IMessageService
	 * @return IMessageService
	 */
	public IMessageService update(IMessageService IMessageService);

	/**
	 * Elimina un IMessageService
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
