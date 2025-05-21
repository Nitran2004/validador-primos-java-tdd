package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorPrimoTest {

    @Test
    public void testUnoNoEsPrimo() {
        // 🚨 Falla porque ValidadorPrimo aún no existe
        assertFalse(ValidadorPrimo.esPrimo(1));
    }

    @Test
    public void testDosEsPrimo() {
    assertTrue(ValidadorPrimo.esPrimo(2));
    }

    @Test
    public void testTresEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(3));
    }

    @Test
    public void testCincoEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(5));
    }

@Test 
    public void testVeintitresEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(23));
    }

    @Test
    public void testVeintinueveEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(29));
    }

    @Test
    public void testTreintaYUnoEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(31));
    }

    @Test
    public void testTreintaYSeisEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(37));
    }

    @Test
    public void testCuarentaYUnoEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(41));
    }

    @Test
    public void testCuarentaYTresEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(43));
    }

    @Test
    public void testCuarentaYSieteEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(47));
    }

    @Test
    public void testCincuentaYTresEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(53));
    }

    @Test
    public void testCincuentaYNueveEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(59));
    }

    @Test
    public void testSesentaYUnoEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(61));
    }

    @Test
    public void testSesentaYSieteEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(67));
    }

    @Test
    public void testSetentaYUnoEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(71));
    }

    @Test
    public void testSetentaYTresEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(73));
    }

    @Test
    public void testSetentaYNueveEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(79));
    }

    @Test
    public void testOchentaYTresEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(83));
    }

    @Test
    public void testOchentaYNueveEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(89));
    }

    @Test
    public void testNoventaYSieteEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(97));
    }
}