package com.company;

import java.util.Scanner;

public class Main {


    static int suma;
    static int[] mas = new int[5];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 5 skaicius");
        for (int i = 0; i < 5; i++) {

            int skaicius = sc.nextInt();
            mas[i] = skaicius;
            suma += skaicius;
        }
        System.out.println("suma " + isvestis());
    }

    public static int isvestis() {
        for (int i = 0; i < 5; i++) {
            System.out.println(mas[i]);
        }
        return suma;


    }
}
