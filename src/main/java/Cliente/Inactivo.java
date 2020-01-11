package Cliente;

import Cliente.Actividad;

public class Inactivo implements Actividad {
    public boolean esActivo() {
        return false;
    }
}
