/**
 * 
 */
package com.pruebatecnica.www.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "party")
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name_party")
	private String nameParty;
	
	@ManyToOne
	@JoinColumn(name = "id_game")
	private Game game;

	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;

	/**
	 * 
	 */
	public Party() {
	}

	/**
	 * @param nameParty
	 * @param game
	 * @param user
	 */
	public Party(String nameParty, Game game, User user) {
		this.nameParty = nameParty;
		this.game = game;
		this.user = user;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nameParty
	 */
	public String getNameParty() {
		return nameParty;
	}

	/**
	 * @param nameParty the nameParty to set
	 */
	public void setNameParty(String nameParty) {
		this.nameParty = nameParty;
	}

	/**
	 * @return the game
	 */
	public Game getGame() {
		return game;
	}

	/**
	 * @param game the game to set
	 */
	public void setGame(Game game) {
		this.game = game;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
}
