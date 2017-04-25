package ro.irian.fullstack.pizza.domain;

import java.util.Date;

/**
 * Created by stefan on 25/04/2017.
 */

public class Reservation {

    private String _id;

    private String name;

    private Date date;

    private Integer howManyPeople;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
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
