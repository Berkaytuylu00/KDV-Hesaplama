package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tutar, KDV_Orani = 0.20, KDV_Tutari, KDVLİ_Tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı giriniz : ");
        tutar = input.nextInt();
        KDV_Tutari=tutar*KDV_Orani;
        KDVLİ_Tutar = tutar+KDV_Tutari;

        System.out.println("Tutar : " +tutar);
        System.out.println("KDV Tutarı: "+KDV_Tutari);
        System.out.println("KDV li tutar : " + KDVLİ_Tutar);
    }
}
