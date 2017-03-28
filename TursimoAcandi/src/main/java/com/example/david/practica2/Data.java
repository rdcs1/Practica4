package com.example.david.practica2;

import android.graphics.drawable.Drawable;

/**
 * Created by David on 26/03/2017.
 */

public class Data {
    protected int photo;
    protected int name;
    protected int score;
    protected int price;
    protected long id;

    public Data(int photo, int name, int score, int price) {
        this.photo = photo;
        this.name = name;
        this.score = score;
        this.price = price;
        //this.id = id;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
