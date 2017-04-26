package ro.restauranto.pizza.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.restauranto.pizza.domain.entity.ReservationEntity;

public interface ReservationRepository extends JpaRepository<ReservationEntity, String> {
}
