package models;

import java.util.Random;

/**
 * Created by COM2-08-PC on 31/7/2561.
 */
public class InputShoes extends Shoes {
    private String color;
    private int discount;
    private String details;
    private String picture;


    public InputShoes() {

    }

    public InputShoes(String id,String name, int amount, int unit, String brand, float size, String color, int discount, String details, String picture) {
        super(id,name, amount, unit, brand, size);
        this.color = color;
        this.discount = discount;
        this.details = details;
        this.picture = picture;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
