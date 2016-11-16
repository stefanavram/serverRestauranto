package ro.irian.fullstack.pizza.domain.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Stefan Avram
 */
@Entity
@Table(name = "review")
public class ReviewEntity extends BaseEntity{

    private Integer stars;

    private String body;

    private String author;

    private Long createdOn;

    @ManyToOne
    private PizzaEntity pizza;

    public void prePersist(){
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
}
