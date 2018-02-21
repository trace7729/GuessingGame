package com.example.hole1.guessinggame;

public class BirdItem {
    String name;
    int image;
    public BirdItem(String name, int image){
        this.name=name;
        this.image=image;
    }
    public String getName(){
        return name;
    }
    public int getImage(){
        return image;
    }
}
