package ro.restauranto.pizza.domain;

import java.util.Date;

public class Reservation {


    private String name;

    private Date date;

    private Integer howManyPeople;

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
