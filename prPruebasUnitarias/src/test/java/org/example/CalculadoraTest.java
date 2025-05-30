package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private Calculadora tcalc;

    // Se ejecuta antes de cada prueba
    @BeforeEach
    public void setup() {
        System.out.println("Esto se ejecuta antes de los testings");
        tcalc = new Calculadora();
    }

    // Prueba unitaria para hallar el IVA
    @Test
    public void hallarIvaTest() {
        System.out.println("Ejecutando prueba de Hallar IVA...");
        Double valor = 20000.0;
        Double valorEsperado = 3800.0; // Suponiendo que el IVA es del 19%
        Double valorActual = tcalc.hallarIva(valor);

        assertEquals(valorEsperado, valorActual, "El valor esperado es: " + valorEsperado);
    }

    // Prueba unitaria para hallar la comisión
    @Test
    public void hallarComisionTest() {
        System.out.println("Ejecutando prueba de Hallar Comisión...");
        Double valor = 100.0;
        Double porc = 0.05;           // 5%
        Double valorEsperado = 5.0;
        Double valorActual = tcalc.hallarComision(porc, valor);

        assertEquals(valorEsperado, valorActual, "La comisión calculada no es la esperada");
        assertInstanceOf(Double.class, valorActual);
        assertTrue(valorActual > 0.0, "La comisión debe ser mayor que cero");
        assertFalse(valorActual < 0, "La comisión no puede ser negativa");
        assertNotNull(valorActual, "El valor calculado no debe ser nulo");
    }

    // Se ejecuta una vez después de todas las pruebas
    @AfterAll
    public static void finalizar() {
        System.out.println("Fin de pruebas");
    }
}
