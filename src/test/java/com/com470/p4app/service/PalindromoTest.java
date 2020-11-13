package com.com470.p4app.service;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Juan Carlos
 */
public class PalindromoTest {
    private Palindromo utils;    

    @Before
    public void setUp() {
        utils = new Palindromo();
    }

    @Test
    public void testBuscaPalindromo1() {
        
        String cadena="REcoNocer";
        boolean esperado=true;
        boolean resultado = utils.buscaPalindromo(cadena);
        assertEquals(esperado, resultado);
       
    }
    @Test
    public void testBuscaPalindromo2() {
        assertTrue(utils.buscaPalindromo("somos"));
       
    }
    @Test
    public void testBuscaPalindromo3() {
        assertFalse(utils.buscaPalindromo("PEdro"));
       
    }
       
}
