package ro.irian.fullstack.pizza.service;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.irian.fullstack.pizza.domain.Reservation;
import ro.irian.fullstack.pizza.domain.Review;
import ro.irian.fullstack.pizza.domain.entity.PizzaEntity;
import ro.irian.fullstack.pizza.domain.entity.ReservationEntity;
import ro.irian.fullstack.pizza.domain.entity.ReviewEntity;
import ro.irian.fullstack.pizza.service.repository.ReservationRepository;
import ro.irian.fullstack.pizza.service.repository.ReviewRepository;
import ro.irian.fullstack.pizza.service.transformers.ReservationTransformer;
import ro.irian.fullstack.pizza.service.transformers.ReviewTransformer;

import java.util.List;

/**
 * Created by stefan on 23/11/2016.
 */
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
