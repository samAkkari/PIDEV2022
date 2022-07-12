package tn.esprit.pidev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.pidev.entities.Hotel;
import tn.esprit.pidev.repositories.HotelRepository;

@Service
public class HotelService implements IHotelService {

	
	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public Long ModifierHotel(Hotel hotel) {
		hotelRepository.save(hotel);
		return hotel.getIdHotel();
	}

	@Override
	public Long AjouterHotel(Hotel hotel) {
		hotelRepository.save(hotel);
		return hotel.getIdHotel();
	}

	@Override
	public void SupprimerHotel(Long idHotel) {
		hotelRepository.deleteById(idHotel);
	}

	@Override
	public Hotel getHotelById(Long idHotel) {
		return hotelRepository.findById(idHotel).orElse(null);
	}

	@Override
	public List<Hotel> getHotels() {
		return hotelRepository.findAll();
	}

	
	
}
