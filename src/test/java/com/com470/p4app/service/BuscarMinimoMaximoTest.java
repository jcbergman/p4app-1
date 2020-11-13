package com.com470.p4app.service;

import com.com470.p4app.model.MinimoMaximo;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;

import org.junit.Test;

public class BuscarMinimoMaximoTest {

    private BuscarMinimoMaximo utils = new BuscarMinimoMaximo();

    @Test
    public void testBuscaMinimoMaximoUno() {
        List<Integer> lista = Arrays.asList(3, 2, 1, 55, 88, 200);
        MinimoMaximo esperado = new MinimoMaximo(1, 200);
        MinimoMaximo resultado = utils.buscaMinimoMaximo(lista);
        test(esperado,lista);

    }
    @Test
    public void testBuscaMinimoMaximoDos() {
        List<Integer> lista = Arrays.asList(3, 2, 1, 55, 88, -200);
        MinimoMaximo esperado = new MinimoMaximo(-200,88);
        MinimoMaximo resultado = utils.buscaMinimoMaximo(lista);
        test(esperado,lista);

    }
    private void test(MinimoMaximo esperado,List<Integer> lista){
        Assert.assertEquals(esperado, utils.buscaMinimoMaximo(lista));
    }

}
