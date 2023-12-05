/**
 * 
 */
package com.pruebatecnica.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.www.dto.Party;
import com.pruebatecnica.www.implement.PartyServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/partys")
public class PartyController {

	@Autowired
	PartyServiceImpl partyServiceImpl;

	/**
	 * Deveuelve todos los partys
	 * 
	 * @return List<Party>
	 */
	@GetMapping("/all/{id}")
	public List<Party> all(@PathVariable(name = "id") Long id) {
		return partyServiceImpl.getAllByGame(id);
	}

	/**
	 * Añade un party a la base de datos
	 * 
	 * @param party
	 * @return Party
	 */
	@PostMapping("/new")
	public Party create(@RequestBody Party party) {

		return partyServiceImpl.add(party);
	}

}
