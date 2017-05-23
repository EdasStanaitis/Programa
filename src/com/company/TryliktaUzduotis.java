package com.company;

import java.util.Scanner;

/**
 * Created by Egd on 2017-05-23.
 */
public class TryliktaUzduotis {
    private double a;
    private double kvadratas;

    public void paprasymas(){
        System.out.println("iveskite skaiciu");
    }
    public double nuskaityti(){
        Scanner skaneris=new Scanner(System.in);
        a=skaneris.nextDouble();
        return a;
    }
    public double skaiciavimas(){
         kvadratas=Math.pow(a,2);
        return kvadratas;
    }
    public void isvedimas(){
        System.out.println("sio skaiciaus kvadratas"+kvadratas);
    }
}

