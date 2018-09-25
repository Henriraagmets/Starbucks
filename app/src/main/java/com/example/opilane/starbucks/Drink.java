package com.example.opilane.starbucks;

import java.util.ArrayList;
import java.util.List;

public class Drink {

    String name,description;
    int imageResourceID;
    private List<Drink> list= new ArrayList<>();

    public void Drink(String name,String description,int imageResourceID){
        this.name=name;
        this.description=description;
        this.imageResourceID=imageResourceID;

    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private static final String[] [] data={
            {"Latte","A shot of foamy espresso with steamed milk",list.adddrawable.latte},
            {"Cappucino","A double espresso with steamed milk foam",R.drawable.cappucino},
            {"Filter",""}
    }
}
