package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sumtest{
    @Test
    public void sumTest(){
        Soma soma = new Soma();
        assertEquals(14, soma.rotaSoma(6,8));
    };
    @Test 
    public void subTest(){
        
        Subtracao subtracao = new Subtracao();
        assertEquals(0, subtracao.rotaSub(2, 2));

    }
}