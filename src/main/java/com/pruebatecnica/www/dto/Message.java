/**
 * 
 */
package com.pruebatecnica.www.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * 
 */
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "content")
	private String content;

	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;

	@ManyToOne
	@JoinColumn(name = "id_party")
	private Party party;

	/**
	 * 
	 */
	public Message() {
	}

	/**
	 * @param content
	 * @param user
	 * @param party
	 */
	public Message(String content, User user, Party party) {
		this.content = content;
		this.user = user;
		this.party = party;
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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
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

	/**
	 * @return the party
	 */
	public Party getParty() {
		return party;
	}

	/**
	 * @param party the party to set
	 */
	public void setParty(Party party) {
		this.party = party;
	}

}
