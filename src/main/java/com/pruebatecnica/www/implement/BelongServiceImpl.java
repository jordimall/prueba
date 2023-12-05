/**
 * 
 */
package com.pruebatecnica.www.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.www.dao.IBelongDAO;
import com.pruebatecnica.www.dto.Belong;
import com.pruebatecnica.www.service.IBelongService;

/**
 * 
 */
@Service
public class BelongServiceImpl implements IBelongService {

	@Autowired
	IBelongDAO daoBelong;

	/**
	 * Añade un belong a la base de datos
	 * 
	 * @param belong
	 * @return Belong
	 */
	public Belong add(Belong belong) {
		return daoBelong.save(belong);
	}

	/**
	 * Elimina un belong
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		daoBelong.deleteById(id);
	}
}
