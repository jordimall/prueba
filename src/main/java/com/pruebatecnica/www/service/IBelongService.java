/**
 * 
 */
package com.pruebatecnica.www.service;

import com.pruebatecnica.www.dto.Belong;

/**
 * 
 */
public interface IBelongService {

	/**
	 * Añade un belong a la base de datos
	 * 
	 * @param belong
	 * @return Belong
	 */
	public Belong add(Belong belong);

	/**
	 * Elimina un belong
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
