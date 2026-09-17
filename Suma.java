/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suma;

/**
 *
 * @author Usuario
 */

public class Suma {

    // Método estático para realizar las operaciones y calcular la suma
    public static double calcular_suma() {
        double suma = 0;
        double x = 20;
        
        suma = suma + x; // suma = 20
        
        double y = 40;
        x = x + Math.pow(y, 2); // x = 20 + (40 al cuadrado) = 1620
        
        suma = suma + (x / y); // suma = 20 + (1620 / 40) = 40.5
        
        return suma;
    }
}
class main{
    public static void main(String[] args) {
        // Llamada al método estático
        double resultadoSuma = calcular_suma();
        
        // Imprimir el resultado final tal como pide el ejercicio
        System.out.println("EL VALOR DE LA SUMA ES: " + resultadoSuma);
    }
}
