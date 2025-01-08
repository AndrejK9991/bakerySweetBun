package by.kovsh.bakerySweetBun.service.dto;

import by.kovsh.bakerySweetBun.entity.Ingredients;

public class FreshBreadDto {

    private Long id;

    private String name;

    private Long mass;

    private Long price;

    private Ingredients ingredients;

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getMass() {
        return mass;
    }

    public void setMass(Long mass) {
        this.mass = mass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
