package tn.esprit.pidev.repositories;


import org.springframework.data.jpa.repository.JpaRepository;


import tn.esprit.pidev.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
