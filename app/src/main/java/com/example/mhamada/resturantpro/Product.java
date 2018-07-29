package com.example.mhamada.resturantpro;

import com.google.gson.annotations.SerializedName;

/**
 * Created by M.Hamada on 26/07/2018.
 */

public class Product {
    @SerializedName("Name")
    private String name;
    @SerializedName("Image_path")
    private String image_path;
    @SerializedName("Price")
    private int price;

    public String getName() {
        return name;
    }

    public String getImage_path() {
        return image_path;
    }

    public int getPrice() {
        return price;
    }
}
