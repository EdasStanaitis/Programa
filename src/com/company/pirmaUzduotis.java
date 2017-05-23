package com.company;

import java.util.Scanner;

/**
 * Created by Egd on 2017-05-23.
 */
public class pirmaUzduotis {

        private String vardas;

        public void pasisveikinimas() {
            System.out.println("Iveskite vartotojo varda");
        }

        public void nuskaitymas() {
            Scanner skaneris = new Scanner(System.in);
            vardas = skaneris.nextLine();
        }

        public void spausdinimas() {
            for (int i = 0; i < 5; i++) {
                System.out.println(vardas);
            }
        }

    }

