package org.example;

public class Calculadora {
    public Double hallarIva(Double valor){
        return valor * 19/100;
    }
    public Double hallarComision(Double porc, Double valor){
        return porc * valor;
    }
}
