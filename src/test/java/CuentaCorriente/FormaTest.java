package CuentaCorriente;

import org.junit.Assert;
import org.junit.Test;

public class FormaTest {

    @Test
    public void test00SeCreaUnaFormaDebitoYElMontoEsNegativo(){
        Forma forma = new Debito();

        Assert.assertEquals(-1000, forma.monto(1000));
    }

    @Test
    public void test01SeCreaUnaFormaCreditoYElMontoEsPositivo(){
        Forma forma = new Credito();

        Assert.assertEquals(1000, forma.monto(1000));
    }
}
