package org.example;

public class Main {
    public static void main(String[] args) {
        Calculadora ocalc = new Calculadora();
        System.out.println(ocalc.hallarIva(3000.0));
        System.out.println(ocalc.hallarComision(0.05, 1000.0));
    }
}