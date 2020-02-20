package com.Exemplu.Clasa;

public class Car {
    public String color;
    public int year;
    public String model;

    public Car(){
}

public Car(String color, int year, String model){
        this.color = color;
        this.year = year;
        this.model = model;
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    //Acuma scriem metode:

    public void stops(){
        System.out.println(model + "stops");
    }

    public void merge(){
        System.out.println(model + "merge.");
    }
}
