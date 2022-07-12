package tn.esprit.pidev.services;

import java.util.List;

import tn.esprit.pidev.entities.Hotel;

public interface IHotelService {

	Long ModifierHotel(Hotel hotel);

	Long AjouterHotel(Hotel hotel);

	void SupprimerHotel(Long idHotel);

	Hotel getHotelById(Long idHotel);

	List<Hotel> getHotels();
}
