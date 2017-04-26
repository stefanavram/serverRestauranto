package ro.restauranto.pizza.domain;

public class PizzaOverview {

    private String _id;
    private String name;
    private Double price;
    private Integer weight;
    private String image;
    private String ingredients;

    private Double averageRating;

    public PizzaOverview(String _id,
                         String name,
                         Double price,
                         Integer weight,
                         String image,
                         String ingredients,
                         Double averageRating) {
        this._id = _id;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.image = image;
        this.ingredients = ingredients;
        this.averageRating = averageRating;
    }

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }
}
