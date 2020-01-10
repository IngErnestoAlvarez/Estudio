import java.util.Date;

public class Movimiento {
    private Date fecha;
    private Proceso proceso; //Automatico o Manual
    private Forma forma; //Debito o Credito
    private int importe;
    private String Detalle;

    public Movimiento(){
        this.fecha = new Date();
        this.proceso = new Proceso();
        this.forma = new Forma();
        this.importe = 0;
        this.Detalle = "";
    }
}
