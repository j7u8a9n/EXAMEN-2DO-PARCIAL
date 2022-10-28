import java.util.Date;

public class SalidaAlmacen {
    private int numeroSalida;
    private Empleados empleados;
    private Date fechaSalida;
    private Date fechaEntrada;
    private Item item;

    public SalidaAlmacen(int numeroSalida, Empleados empleados, Date fechaSalida, Date fechaEntrada, Item item) {
        this.numeroSalida = numeroSalida;
        this.empleados = empleados;
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
        this.item = item;
    }

    public int getNumeroSalida() {
        return numeroSalida;
    }

    public void setNumeroSalida(int numeroSalida) {
        this.numeroSalida = numeroSalida;
    }

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "SalidaAlmacen{" +
                "numeroSalida=" + numeroSalida +
                ", empleados=" + empleados +
                ", fechaSalida=" + fechaSalida +
                ", fechaEntrada=" + fechaEntrada +
                ", item=" + item +
                '}';
    }
}
