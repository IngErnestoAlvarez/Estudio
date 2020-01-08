import java.util.Date;

public class Cliente {
    private int cuit;
    private String name;
    private Date ingreso;
    private Actividad actividad;
    private CuentaCorriente cuenta;


    public Cliente(){
        this.cuit = 0;
        this.name = "";
        this.ingreso = new Date(2000, 1, 1);
        this.actividad = new Activo();
    }

    public Cliente(int i, String s, Date in){
        this.cuit = i;
        this.name = s;
        this.ingreso = in;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public int getCuit() {
        return cuit;
    }

    public boolean esActivo(){
        return this.actividad.esActivo();
    }

    public void activar(){
        this.actividad = new Activo();
        this.actividad = new Inactivo();
    }
}
