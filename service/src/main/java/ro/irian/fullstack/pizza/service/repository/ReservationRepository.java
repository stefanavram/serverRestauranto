package ro.irian.fullstack.pizza.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.irian.fullstack.pizza.domain.Reservation;
import ro.irian.fullstack.pizza.domain.entity.ReservationEntity;

/**
 * Created by stefan on 25/04/2017.
 */
public interface ReservationRepository extends JpaRepository<ReservationEntity, String> {
}
