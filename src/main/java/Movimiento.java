import java.util.Date;

public class Movimiento {
    private Date fecha;
    private Proceso proceso; //Automatico o Manual
    private Forma forma; //Debito o Credito
    private int importe;
    private String Detalle;

    public Movimiento(){
        this.fecha = new Date(2000, 1, 1);
        this.proceso = new Proceso();
        this.forma = new Forma();
        this.importe = 0;
        this.Detalle = "";
    }
}
