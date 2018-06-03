package com.rrdl.pv.model;

/**
 * Created by Acer ASPIRE on 19/03/2018.
 */

public class Liquide extends Item{
    private String gout;
    private String urlim;
    private float price;

    public Liquide(String gout, String urlim, Float price) {
        super(gout,urlim,price);
        this.gout = gout;
        this.urlim = urlim;
        this.price = price;
    }

    public String getGout() {
        return gout;
    }

    public String getUrlim() {
        return urlim;
    }

    public float getPrice() {
        return price;
    }
}
