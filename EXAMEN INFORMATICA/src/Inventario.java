import java.util.Date;

public class Inventario {
    private String ubicacion;
    private String codigoBienes;
    private Date fechaBienes;

    public Inventario(String ubicacion, String codigoBienes, Date fechaBienes) {
        this.ubicacion = ubicacion;
        this.codigoBienes = codigoBienes;
        this.fechaBienes = fechaBienes;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCodigoBienes() {
        return codigoBienes;
    }

    public void setCodigoBienes(String codigoBienes) {
        this.codigoBienes = codigoBienes;
    }

    public Date getFechaBienes() {
        return fechaBienes;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "ubicacion='" + ubicacion + '\'' +
                ", codigoBienes='" + codigoBienes + '\'' +
                ", fechaBienes=" + fechaBienes +
                '}';
    }

    public void setFechaBienes(Date fechaBienes) {
        this.fechaBienes = fechaBienes;
    }
}
