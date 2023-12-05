/**
 * 
 */
package com.pruebatecnica.www.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.www.dao.IUserDAO;
import com.pruebatecnica.www.dto.User;
import com.pruebatecnica.www.service.IUserService;

/**
 * 
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserDAO daoUser;

	/**
	 * Devuelve un user en especifico
	 * 
	 * @param id
	 * @return User
	 */
	public User getId(Long id) {
		return daoUser.findById(id).get();
	}

	/**
	 * Añade un user a la base de datos
	 * 
	 * @param user
	 * @return User
	 */
	public User add(User user) {
		return daoUser.save(user);
	}

	/**
	 * Actualiza un user
	 * 
	 * @param user
	 * @return User
	 */
	public User update(User user) {
		return daoUser.save(user);
	}

}
