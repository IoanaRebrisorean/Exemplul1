package com.Exemplu.Clasa;

import java.util.Scanner;

public class ReadNumbers {

   private int a;
   private int b;

   private void read() {
       Scanner orice = new Scanner(System.in);
       System.out.println("Dati a= ");
       a = orice.nextInt();
       System.out.println("Dati b= ");
       b = orice.nextInt();
   }

   private void suma(){
       int sum = a + b;
       System.out.println("Suma este: " + sum);
   }

   private void multiply(){
       int prod = a * b;
       System.out.println("Produsul este: " + prod);
   }

   private void division(){
       float imp = (float) a / (float) b ;
       System.out.println("Catul este: " + imp);
   }

   public void all(){
       read();
       suma();
       multiply();
       division();
   }

}
