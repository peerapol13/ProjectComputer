package com.example.proe.Model;

public class ModelCartitem {
    String id,Sid,name,price,cost,quantity;

    public ModelCartitem() {
    }

    public ModelCartitem(String id, String sid, String name, String price, String cost, String quantity) {
        this.id = id;
        this.Sid = sid;
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSid() {
        return Sid;
    }

    public void setSid(String sid) {
        Sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
