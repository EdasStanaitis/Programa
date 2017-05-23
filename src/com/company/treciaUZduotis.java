package com.company;

import java.util.Scanner;

/**
 * Created by Egd on 2017-05-23.
 */
public class treciaUZduotis {
    private int a;
    private int b;


    public void paprasymas(){
        System.out.println("iveskite skaiciu");
    }
    public int nuskaitoPirmaSk(){
        Scanner skaneris=new Scanner(System.in);
        a= skaneris.nextInt();
        return a;
    }
    public int nuskaitoAntraSk(){
        Scanner skaneris=new Scanner(System.in);
        b= skaneris.nextInt();
        return b;}

    public void suskaiciavimas(){
        int suma=a+b;
    System.out.println("suma"+suma);
    int skirtumas=a-b;
        System.out.println("skirtumas"+skirtumas);








    }

}
