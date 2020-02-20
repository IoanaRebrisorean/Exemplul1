package com.Exemplu.Clasa;

public class Main {

    public static void main(String[] args) {
//        ReadNumbers citire = new ReadNumbers();
//        citire.read();
//        citire.suma();
//        citire.multiply();
//        citire.division(); //Pentru a le accesa pe rand trebuie facute publice
//        citire.all();

//        Average2 media = new Average2();
//        media.read2();
//        media.average();

//        PrintName nume = new PrintName();
//        nume.print();

//        Car masina = new Car();
//        masina.setColor("Gri");
//        masina.setModel("Mercedes");
//        masina.setYear(1234);
//        System.out.println(masina.getColor());


        BMW bmw = new BMW();
        bmw.setSpeed(123);
        bmw.setColor("verde");
        bmw.setModel("bmw");
        bmw.setYear(1234);
        bmw.merge();
        System.out.println("Masina este: " + bmw.getModel() + " si are culoarea " + bmw.getColor());
    }
}
