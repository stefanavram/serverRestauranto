package ro.restauranto.pizza.domain.entity;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class ReservationEntity extends BaseEntity {

    private String name;

    private Date date;

    private Integer howManyPeople;

    @PrePersist
    public void prePersist() {
        super.prePersist();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHowManyPeople() {
        return howManyPeople;
    }

    public void setHowManyPeople(Integer howManyPeople) {
        this.howManyPeople = howManyPeople;
    }
}
