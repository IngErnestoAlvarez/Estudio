package CuentaCorriente;

public class Debito implements Forma {

    public int monto(int importe) {
        return -importe;
    }
}
