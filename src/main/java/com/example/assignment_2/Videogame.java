package com.example.assignment_2;

import javafx.scene.image.Image;

public class Videogame {

    private String title;
    private double price;
    private String company;


    public Videogame(String title, double price, String company) {
        setTitle(title);
        setPrice(price);
        setCompany(company);
    }

    public void setPrice(double price) {
        if (price > 0 && price <= 100)
            this.price = price;

        else
            throw new IllegalArgumentException("The price provided has to be in the range of 0 - 100");
    }

    public void setTitle(String title) {
        if (title.length() > 50)
            throw new IllegalArgumentException(title + " cannot be greater than 50 letters");
        else
            this.title = title;
    }

    public void setCompany (String company){
        if (company.length() > 50)
            throw new IllegalArgumentException(company + " cannot be greater than 50 letters");

        else{
            this.company = company;
        }
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public Image getImage(){
        String pathname = "Images/"+title+".jpg";
        return new Image(Videogame.class.getResourceAsStream(pathname));
    }

    @Override
    public String toString() {
        return (title);
    }
}


