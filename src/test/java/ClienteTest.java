import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void test00ClienteSeCreaYSeAñadeCuit(){
        Cliente cliente = new Cliente();

        cliente.setCuit(25);

        Assert.assertEquals(25, cliente.getCuit());
    }
}
