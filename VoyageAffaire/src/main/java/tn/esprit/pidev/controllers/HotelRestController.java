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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.pidev.entities.Hotel;
import tn.esprit.pidev.services.IHotelService;

@RequestMapping("/Hotel")
@Api("Gestion des Hotels")
@RestController
public class HotelRestController {

	@Autowired
	IHotelService hotelService;

	@ApiOperation(value = "Ajouter un hotel")
	@PostMapping("/addhotel")
	@ResponseBody
	public Hotel addHotel(@RequestBody Hotel hotel) {
		hotelService.AjouterHotel(hotel);
		return hotel;
	}

	@ApiOperation(value = "Modifier un hotel")
	@PutMapping("/modifierHotel")
	@ResponseBody
	public Hotel updatHotel(@RequestBody Hotel hotel) {
		hotelService.ModifierHotel(hotel);
		return hotel;
	}

	@ApiOperation(value = "Supprimer un hotel")
	@DeleteMapping("/supprimerHotel/{IdHotel}")
	@ResponseBody
	public void deleteHotel(@PathVariable("IdHotel") Long IdHotel) {
		hotelService.SupprimerHotel(IdHotel);
	}

}
