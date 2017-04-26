package ro.restauranto.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.restauranto.pizza.domain.Reservation;
import ro.restauranto.pizza.domain.entity.ReservationEntity;
import ro.restauranto.pizza.service.repository.ReservationRepository;
import ro.restauranto.pizza.service.transformers.ReservationTransformer;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;


    public List<ReservationEntity> getAllReservations() {

        return reservationRepository.findAll();
    }

    public void addReservation(Reservation reservation) {

        ReservationEntity r = ReservationTransformer.transformToEntity(reservation);
        reservationRepository.save(r);
    }
}
