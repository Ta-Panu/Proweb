package models;

/**
 * Created by COM2-08-PC on 14/8/2561.
 */
public class InputShoesPicture extends Shoes {
    private String picture;
    private String color;
    private int discount;
    private String details;


    public InputShoesPicture(){
        setId();
    }

    public InputShoesPicture(String name, int amount, int unit, String brand, float size, String picture, String color, int discount, String details) {
        super(name, amount, unit, brand, size);
        this.picture = picture;
        this.color = color;
        this.discount = discount;
        this.details = details;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
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
}
