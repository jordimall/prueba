/**
 * 
 */
package com.pruebatecnica.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.www.dto.User;
import com.pruebatecnica.www.implement.UserServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;

	/**
	 * Devuelve un user en especifico
	 * 
	 * @param id
	 * @return User
	 */
	@GetMapping("/show/{id}")
	public User show(@PathVariable(name = "id") Long id) {

		User user_xid = new User();

		user_xid = userServiceImpl.getId(id);

		return user_xid;
	}

	/**
	 * Añade un user a la base de datos
	 * 
	 * @param user
	 * @return User
	 */
	@PostMapping("/new")
	public User create(@RequestBody User user) {

		return userServiceImpl.add(user);
	}

	/**
	 * Actualiza un user
	 * 
	 * @param user
	 * @return User
	 */
	@PutMapping("/update/{id}")
	public User edit(@PathVariable(name = "id") Long id, @RequestBody User user) {

		User userSeleccionado = new User();
		User userActualizado = new User();

		userSeleccionado = userServiceImpl.getId(id);

		userSeleccionado.setUserName(user.getUserName());
		userSeleccionado.setEmail(user.getEmail());
		userSeleccionado.setPassword(user.getPassword());

		userActualizado = userServiceImpl.update(userSeleccionado);

		return userActualizado;
	}


}
