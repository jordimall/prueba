/**
 * 
 */
package com.pruebatecnica.www.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "game")
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "nameGame")
	private String nameGame;
	@Column(name = "urlCoverImage")
	private String urlCoverImage;

	/**
	 * 
	 */
	public Game() {
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
	 * @return the nameGame
	 */
	public String getNameGame() {
		return nameGame;
	}

	/**
	 * @param nameGame the nameGame to set
	 */
	public void setNameGame(String nameGame) {
		this.nameGame = nameGame;
	}

	/**
	 * @return the urlCoverImage
	 */
	public String getUrlCoverImage() {
		return urlCoverImage;
	}

	/**
	 * @param urlCoverImage the urlCoverImage to set
	 */
	public void setUrlCoverImage(String urlCoverImage) {
		this.urlCoverImage = urlCoverImage;
	}

}
