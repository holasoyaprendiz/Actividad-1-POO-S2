/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edades;

import java.util.Scanner;

public class Edades {

    public static double calcular_edalber(double edjuan) {
        return (2.0 / 3.0) * edjuan;
    }

    public static double calcular_edana(double edjuan) {
        return (4.0 / 3.0) * edjuan;
    }

    public static double calcular_edmama(double edjuan, double edalber, double edana) {
        return edjuan + edalber + edana;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, ingresa la edad de Juan:");
        double edjuan = scanner.nextDouble();
        
        double edalber = calcular_edalber(edjuan);
        double edana = calcular_edana(edjuan);
        double edmama = calcular_edmama(edjuan, edalber, edana);
        
        System.out.println("\n--- Edades de los cuatro ---");
        System.out.println("Edad de Juan: " + (int) edjuan);
        System.out.println("Edad de Alberto: " + (int) edalber);
        System.out.println("Edad de Ana: " + (int) edana);
        System.out.println("Edad de Mamá: " + (int) edmama);
        
        scanner.close();
    }
}