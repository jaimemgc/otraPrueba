package empleado;

public class Empleado {

    private String nombre;
    private int sueldo;

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void aumentarSueldo(int aumento) {
        this.sueldo = this.sueldo + aumento;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre +
                ", sueldo=" + sueldo;
    }
}
