package com.rrdl.pv.model;

/**
 * Created by Acer ASPIRE on 19/03/2018.
 */

public class Outils extends Item {
    private String name;
    private String urlim;
    private float price;

    public Outils(String name, String urlim, Float price) {
        super(name,urlim,price);
        this.name = name;
        this.urlim = urlim;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getUrlim() {
        return urlim;
    }

    public float getPrice() {
        return price;
    }
}

