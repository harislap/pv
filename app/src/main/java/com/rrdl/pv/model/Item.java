package com.rrdl.pv.model;

/**
 * Created by Acer ASPIRE on 19/03/2018.
 */

public class Item {
    String name;
    String urlim;
    float price;

    public Item(String name, String urlim, float price) {
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
