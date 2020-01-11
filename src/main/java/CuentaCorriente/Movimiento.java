package CuentaCorriente;

import java.util.Date;

public abstract class Movimiento {
    private int importe;
    private Date fecha;
    private Forma forma; //Debito o Credito
    private String Detalle;

    public Movimiento(){
        this.fecha = new Date();
        this.forma = new Debito();
        this.importe = 0;
        this.Detalle = "";
    }

    public abstract void repetir();

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public int monto(){
        return this.forma.monto(this.importe);
    }
}
