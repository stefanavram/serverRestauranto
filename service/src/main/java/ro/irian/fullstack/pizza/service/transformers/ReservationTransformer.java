package ro.irian.fullstack.pizza.service.transformers;

import ro.irian.fullstack.pizza.domain.Reservation;
import ro.irian.fullstack.pizza.domain.entity.ReservationEntity;

public class ReservationTransformer {
    public static ReservationEntity transformToEntity(Reservation r) {
        ReservationEntity reservationEntity = new ReservationEntity();

        reservationEntity.setName(r.getName());
        reservationEntity.setDate(r.getDate());
        reservationEntity.setHowManyPeople(r.getHowManyPeople());
        return reservationEntity;
    }
}
