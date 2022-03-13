package app;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest{

    Soma soma;
    Subtracao subtracao;
    
    @BeforeEach
    public void setup(){
        soma = new Soma();
        subtracao = new Subtracao();
    }

    @Test
    public void testSum(){
        assertEquals(14.0, soma.rotaSoma(6.0, 8.0));
    };
    @Test 
    public void testSub(){
        
        assertEquals(0.0, subtracao.rotaSub(2.0, 2.0));

    }
}