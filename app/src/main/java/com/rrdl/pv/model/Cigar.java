package com.rrdl.pv.model;

import android.util.Log;

/**
 * Created by Acer ASPIRE on 19/03/2018.
 */

public class Cigar extends Item{
    private String model;
    private String urlim;
    private float price;
    public Cigar(String model, String urlim, float price){
        super(model,urlim,price);
        this.model = model;
        this.urlim = urlim;
        this.price = price;
        Log.i("Cigar","constructor");
    }

    public String getModel() {
        return model;
    }

    public String urlim() {
        return urlim;
    }

    public float getPrice() {
        return price;
    }
}
