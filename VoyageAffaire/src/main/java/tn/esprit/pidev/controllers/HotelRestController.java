package tn.esprit.pidev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.pidev.entities.Hotel;
import tn.esprit.pidev.services.IHotelService;

@RequestMapping("/Hotel")
@RestController
public class HotelRestController {

	@Autowired
	IHotelService hotelService;

	
	
	@PostMapping("/addhotel")
	@ResponseBody
	public Hotel addHotel(@RequestBody Hotel hotel) {
		hotelService.AjouterHotel(hotel);
		return hotel;
	}

	@PutMapping("/modifierHotel")
	@ResponseBody
	public Hotel updatHotel(@RequestBody Hotel hotel) {
		hotelService.ModifierHotel(hotel);
		return hotel;
	}
	

	@DeleteMapping("/supprimerHotel/{IdHotel}")
	@ResponseBody
	public void deleteHotel(@PathVariable("IdHotel") Long IdHotel) {
		hotelService.SupprimerHotel(IdHotel);
	}
	
	
}
