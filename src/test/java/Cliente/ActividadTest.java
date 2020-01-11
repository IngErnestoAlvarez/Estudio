package Cliente;

import org.junit.Assert;
import org.junit.Test;

public class ActividadTest {

    @Test
    public void testActivo(){
        Actividad actividad = new Activo();

        Assert.assertTrue(actividad.esActivo());
    }

    @Test
    public void testInactivo(){
        Actividad actividad = new Inactivo();

        Assert.assertFalse(actividad.esActivo());
    }
}
