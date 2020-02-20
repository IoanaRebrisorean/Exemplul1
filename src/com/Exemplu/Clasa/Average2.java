package com.Exemplu.Clasa;

import java.util.Scanner;

public class Average2 {
    public int m;
    public int n;
    public int o;

    public void read2(){
        Scanner salut = new Scanner(System.in);
        System.out.println("Dati m: ");
        m = salut.nextInt();
        System.out.println("Dati n: ");
        n = salut.nextInt();
        System.out.println("Dati o: ");
        o = salut.nextInt();
    }

    public void average(){
        float media =(float) ( m + n + o) / 3;
        System.out.println("Media este: " + media);
    }

}
