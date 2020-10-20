package com.example.goal_location;

public class Goal {

    private String name;
    private String location;
    private int imeg;
    private int price;
    private int phone;


    public Goal(String name, String location, int price, int imeg, int phone) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.imeg = imeg;
        this.phone = phone;


    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImeg() {
        return imeg;
    }

    public void setImeg(int imeg) {
        this.imeg = imeg;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
