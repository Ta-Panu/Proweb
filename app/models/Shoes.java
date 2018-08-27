package models;

import java.util.Random;

public class Shoes {
    private String id;
    private String name;
    private int amount;
    private int unit;
    private String brand;
    private float size;

    public Shoes() {

    }

    public Shoes(String id, String name, int amount, int unit, String brand, float size) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.brand = brand;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Shoes(String name, int amount, int unit, String brand, float size) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.brand = brand;
        this.size = size;
        setId();
    }

    public void setId(){
        int random;
        Random ran = new Random();
        random = ran.nextInt(10000)+1;
        this.id = Integer.toString(random);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
}