package com.company;

import java.util.Scanner;

/**
 * Created by Egd on 2017-05-23.
 */
public class antraUzduotis {
    private String zodis;

    public void paprasymas(){
        System.out.println("iveskite zodi");
    }
    public void nuskanuoti(){
        Scanner skaneris=new Scanner(System.in);
        zodis=skaneris.nextLine();
    }
    public void suskaiciuoti(){
        System.out.println(zodis.length());
    }
}
