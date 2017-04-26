package ro.irian.fullstack.pizza.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class ReviewEntity extends BaseEntity {

    private Integer stars;

    private String body;

    private String author;

    private Long createdOn;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "pizza_id", referencedColumnName = "id")
    private PizzaEntity pizza;

    @PrePersist
    public void prePersist() {
        super.prePersist();
        this.createdOn = System.currentTimeMillis();
    }


    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    public PizzaEntity getPizza() {
        return pizza;
    }

    public void setPizza(PizzaEntity pizza) {
        this.pizza = pizza;
    }

}
