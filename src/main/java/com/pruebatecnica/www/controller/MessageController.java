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

import com.pruebatecnica.www.dto.Message;
import com.pruebatecnica.www.implement.MessageServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/messages")
public class MessageController {

	@Autowired
	MessageServiceImpl messageServiceImpl;

	/**
	 * Deveuelve todos los messages
	 * 
	 * @return List<Message>
	 */
	@GetMapping("/all/{id}")
	public List<Message> all(@PathVariable(name = "id") Long id) {
		return messageServiceImpl.getAllByMessage(id);
	}

	/**
	 * Devuelve un message en especifico
	 * 
	 * @param id
	 * @return Message
	 */
	@GetMapping("/show/{id}")
	public Message show(@PathVariable(name = "id") Long id) {

		Message message_xid = new Message();

		message_xid = messageServiceImpl.getId(id);

		return message_xid;
	}

	/**
	 * Añade un message a la base de datos
	 * 
	 * @param message
	 * @return Message
	 */
	@PostMapping("/new")
	public Message create(@RequestBody Message message) {

		return messageServiceImpl.add(message);
	}

	/**
	 * Actualiza un message
	 * 
	 * @param message
	 * @return Message
	 */
	@PutMapping("/update/{id}")
	public Message edit(@PathVariable(name = "id") Long id, @RequestBody Message message, @RequestBody Long idUser) {

		Message messageSeleccionado = new Message();
		Message messageActualizado = new Message();

		messageSeleccionado = messageServiceImpl.getId(id);

		if(idUser == messageSeleccionado.getId()) {
			messageSeleccionado.setContent(message.getContent());

			messageActualizado = messageServiceImpl.update(messageSeleccionado);
			
			return messageActualizado;
		}

		return null;
	}

	/**
	 * Elimina un message
	 * 
	 * @param id
	 */
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		messageServiceImpl.delete(id);
	}

}
