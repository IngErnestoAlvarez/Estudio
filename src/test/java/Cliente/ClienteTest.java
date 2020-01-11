package Cliente;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void test00ClienteSeCreaYSeAñadeCuit(){
        Cliente cliente = new Cliente();

        cliente.setCuit(25);

        Assert.assertEquals(25, cliente.getCuit());
    }

    @Test
    public void test01ClienteSeCreaYEsClienteActivo(){
        Cliente cliente = new Cliente();

        Assert.assertTrue(cliente.esActivo());
    }

    @Test
    public void test02ClienteSeCreaYSeDesactiva(){
        Cliente cliente = new Cliente();

        cliente.desactivar();

        Assert.assertFalse(cliente.esActivo());
    }

    @Test
    public void test03ClienteSeCreaSeDesactivaYSeVuelveAActivar(){
        Cliente cliente = new Cliente();

        cliente.desactivar();

        cliente.activar();

        Assert.assertTrue(cliente.esActivo());
    }
}
