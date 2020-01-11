package Cliente;

import CuentaCorriente.CuentaCorriente;

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
        this.ingreso = new Date();
        this.actividad = new Activo();
    }

    public Cliente(int i, String s, Date in){
        this.cuit = i;
        this.name = s;
        this.ingreso = in;
        this.actividad = new Activo();
        this.cuenta = new CuentaCorriente();
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
    }

    public void desactivar(){
        this.actividad = new Inactivo();
    }
}
