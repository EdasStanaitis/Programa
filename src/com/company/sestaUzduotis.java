package com.company;

import java.util.Scanner;

/**
 * Created by Egd on 2017-05-23.
 */
public class sestaUzduotis {
    private double m;
    private double u;
    public double kmi;



    public void PaprasytiMases() {
        System.out.println("iveskite mase");
    }

    public double mase() {
        Scanner skaneris = new Scanner(System.in);
        m = skaneris.nextDouble();
        return m;
    }

    public void PaprasytiUgio() {
        System.out.println("iveskite ugi");
    }

    public double ugis() {
        Scanner skaneris = new Scanner(System.in);
        u = skaneris.nextDouble();
        return u;
    }

    public double kunoMasesIndeksas() {


        double kmi = m / (u*u);
        return kmi;

    }

    public void isvedimas() {
        System.out.println("kuno mases indekas" + kunoMasesIndeksas());
    }
}
