import java.util.Date;

public class EntradaAlmacen {
    private  int cantidadEntrada;
    private Date fechaEntrega;

    public EntradaAlmacen(int cantidadEntrada, Date fechaEntrega) {
        this.cantidadEntrada = cantidadEntrada;
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidadEntrada() {
        return cantidadEntrada;
    }

    public void setCantidadEntrada(int cantidadEntrada) {
        this.cantidadEntrada = cantidadEntrada;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "EntradaAlmacen{" +
                "cantidadEntrada=" + cantidadEntrada +
                ", fechaEntrega=" + fechaEntrega +
                '}';
    }
}
