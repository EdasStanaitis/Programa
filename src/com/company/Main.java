package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iveskite uzduoties numeri kuria norite ispresti nuo 1-6");
        Scanner skaneris = new Scanner(System.in);
        int numeris = skaneris.nextInt();

        // write your code hereswi
        switch (numeris) {
            case 1:

                pirmaUzduotis objektas = new pirmaUzduotis();
                objektas.pasisveikinimas();
                objektas.nuskaitymas();
                objektas.spausdinimas();
                break;
            case 2:
                antraUzduotis obis=new antraUzduotis();
                obis.paprasymas();
                obis.nuskanuoti();
                obis.suskaiciuoti();
                break;
            case 3:
               treciaUZduotis objekta = new treciaUZduotis();
                objekta.paprasymas();
                objekta.nuskaitoPirmaSk();
                objekta.paprasymas();
                objekta.nuskaitoAntraSk();
                objekta.suskaiciavimas();
            case 4:

                ketvritaUzduotis objektai = new ketvritaUzduotis();
                objektai.paprasymas();
                objektai.nuskaitoPirmaSk();
                objektai.paprasymas();
                objektai.nuskaitoAntraSk();
                objektai.suma();
                objektai.skirtumas();
                objektai.isvedimas();

                break;
            case 5:
                uzduotisPenkta objekta5 = new uzduotisPenkta();
                objekta5.paprasymas();
                objekta5.nuskaitoPirmaSk();
                objekta5.paprasymas();
                objekta5.nuskaitoAntraSk();
                objekta5.suma();
                objekta5.skirtumas();
                objekta5.isvedimas();

                break;

            case 6:
                sestaUzduotis objektas6 = new sestaUzduotis();
                objektas6.PaprasytiMases();
                objektas6.mase();
                objektas6.PaprasytiUgio();
                objektas6.ugis();
                objektas6.kunoMasesIndeksas();
                objektas6.isvedimas();
                break;
            case 13:
                TryliktaUzduotis obijektas13=new TryliktaUzduotis();
                obijektas13.paprasymas();
                obijektas13.nuskaityti();
                obijektas13.skaiciavimas();
                obijektas13.isvedimas();

        }
    }
}
