package com.Exemplu.Clasa;

public class BMW extends Car {

    public int speed;

    public BMW(){
    }

    public BMW(String color, int year, String model, int speed){
        super(color, year, model);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void merge() {
        System.out.println("Se plimba");
    }
}
