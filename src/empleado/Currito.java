package empleado;

public class Currito extends Empleado {
    private String nombreJefe;

    public Currito(String nombre, int sueldo, String nombreJefe) {
        super(nombre, sueldo);
        this.nombreJefe = nombreJefe;
    }

    public void setNombreJefe(String nombreJefe) {
        this.nombreJefe = nombreJefe;
    }


}
