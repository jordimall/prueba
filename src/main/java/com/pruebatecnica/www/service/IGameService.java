/**
 * 
 */
package com.pruebatecnica.www.service;

import java.util.List;

import com.pruebatecnica.www.dto.Game;

/**
 * 
 */
public interface IGameService {
	/**
	 * Deveuelve todos los games
	 * 
	 * @return List<Game>
	 */
	public List<Game> getAll();

	/**
	 * Devuelve un game en especifico
	 * 
	 * @param id
	 * @return Game
	 */
	public Game getId(Long id);

	/**
	 * Añade un game a la base de datos
	 * 
	 * @param game
	 * @return Game
	 */
	public Game add(Game game);

	/**
	 * Actualiza un game
	 * 
	 * @param game
	 * @return Game
	 */
	public Game update(Game game);

	/**
	 * Elimina un game
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
