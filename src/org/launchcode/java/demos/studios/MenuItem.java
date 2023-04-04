package org.launchcode.java.demos.studios;

public class MenuItem {
    //Class Variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;


    //Constructors
public MenuItem (String name, String description, double price ){
    this.name = name;
    this.description = description;
    this.price = price;

    this.category = "Not Categorized";
    this.isNew = false;
    }

public MenuItem (String name, String description, double price, String category, Boolean isNew ){
    this.name = name;
    this.description = description;
    this.price = price;
    this.category = category;
    this.isNew = isNew;
}
    //Methods
    //Getters & Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNew() {
        return this.isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }
}
