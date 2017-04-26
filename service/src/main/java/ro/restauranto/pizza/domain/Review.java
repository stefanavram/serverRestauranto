package ro.restauranto.pizza.domain;

public class Review {

    private Integer stars;
    private String body;
    private String author;
    private Long createdOn;

    public Review() {
    }

    public Review(Integer stars, String body, String author, Long createdOn) {
        this.stars = stars;
        this.body = body;
        this.author = author;
        this.createdOn = createdOn;
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
