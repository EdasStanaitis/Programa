package com.company;

import java.util.Scanner;

/**
 * Created by Egd on 2017-05-23.
 */
public class ketvritaUzduotis {
    private int a;
    private int b;
    private int suma;
    private int skirtumas;
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

    public int suma(){
        int suma=a+b;
        return suma;
    }
    public  int skirtumas(){
        int skirtumas=a-b;
        return skirtumas;
    }
    public void isvedimas(){
        System.out.println("suma"+suma());
        System.out.println("skirtumas"+skirtumas());

    }


}


