package empleado;

public class Jefe extends Empleado{

    private int presupuesto;

    public Jefe(String nombre, int sueldo) {
        super(nombre, sueldo);
        this.presupuesto=0;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }


    @Override
    public String toString() {
        return super.toString() +
                " presupuesto=" + presupuesto ;
    }
}
