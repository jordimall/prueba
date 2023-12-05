/**
 * 
 */
package com.pruebatecnica.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.www.dto.Belong;
import com.pruebatecnica.www.implement.BelongServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/belongs")
public class BelongController {

	@Autowired
	BelongServiceImpl belongServiceImpl;

	/**
	 * Añade un belong a la base de datos
	 * 
	 * @param belong
	 * @return Belong
	 */
	@PostMapping("/new")
	public Belong create(@RequestBody Belong belong) {

		return belongServiceImpl.add(belong);
	}

	/**
	 * Elimina un belong
	 * 
	 * @param id
	 */
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		belongServiceImpl.delete(id);
	}

}
