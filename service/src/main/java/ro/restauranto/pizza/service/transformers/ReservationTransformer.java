package ro.restauranto.pizza.service.transformers;

import ro.restauranto.pizza.domain.Reservation;
import ro.restauranto.pizza.domain.entity.ReservationEntity;

public class ReservationTransformer {
    public static ReservationEntity transformToEntity(Reservation r) {
        ReservationEntity reservationEntity = new ReservationEntity();

        reservationEntity.setName(r.getName());
        reservationEntity.setDate(r.getDate());
        reservationEntity.setHowManyPeople(r.getHowManyPeople());
        return reservationEntity;
    }
}
