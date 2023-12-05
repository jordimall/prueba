/**
 * 
 */
package com.pruebatecnica.www.service;

import com.pruebatecnica.www.dto.User;

/**
 * 
 */
public interface IUserService {

	/**
	 * Devuelve un user en especifico
	 * 
	 * @param id
	 * @return User
	 */
	public User getId(Long id);

	/**
	 * Añade un user a la base de datos
	 * 
	 * @param user
	 * @return User
	 */
	public User add(User user);

	/**
	 * Actualiza un user
	 * 
	 * @param user
	 * @return User
	 */
	public User update(User user);

}
