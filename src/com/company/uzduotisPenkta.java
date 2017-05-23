package com.company;

import java.util.Scanner;

/**
 * Created by Egd on 2017-05-23.
 */
public class uzduotisPenkta {
    private double a;
    private double b;
    private double suma;
    private double skirtumas;

    public void paprasymas() {
        System.out.println("iveskite skaiciu");
    }

    public double nuskaitoPirmaSk() {
        Scanner skaneris = new Scanner(System.in);
        a = skaneris.nextDouble();
        return a;
    }

    public double
    nuskaitoAntraSk() {
        Scanner skaneris = new Scanner(System.in);
        b = skaneris.nextDouble();
        return b;
    }

    public double suma() {
        double suma = a + b;
        return suma;
    }

    public double skirtumas() {
        double skirtumas = a - b;
        return skirtumas;
    }

    public void isvedimas() {
        System.out.println("suma" + suma());
        System.out.println("skirtumas" + skirtumas());
    }
}
