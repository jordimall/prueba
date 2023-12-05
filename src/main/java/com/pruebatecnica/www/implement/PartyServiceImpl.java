/**
 * 
 */
package com.pruebatecnica.www.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.www.dao.IPartyDAO;
import com.pruebatecnica.www.dto.Party;
import com.pruebatecnica.www.service.IPartyService;

/**
 * 
 */
@Service
public class PartyServiceImpl implements IPartyService {

	@Autowired
	IPartyDAO daoParty;

	/**
	 * Deveuelve todos los partys
	 * 
	 * @return List<Party>
	 */
	public List<Party> getAllByGame(Long id) {
		return daoParty.findByGameId(id);
	}

	/**
	 * Añade un party a la base de datos
	 * 
	 * @param party
	 * @return Party
	 */
	public Party add(Party party) {
		return daoParty.save(party);
	}

}
