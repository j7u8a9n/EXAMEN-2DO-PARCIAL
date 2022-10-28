import java.util.Date;

public class Solicitud {
    private int numeroSolicitud;
    private Date fecha;
    private Persona persona;
    private Double unCosto;
    private Double variosCostos;

    public Solicitud(int numeroSolicitud, Date fecha, Persona persona, Double unCosto, Double variosCostos) {
        this.numeroSolicitud = numeroSolicitud;
        this.fecha = fecha;
        this.persona = persona;
        this.unCosto = unCosto;
        this.variosCostos = variosCostos;
    }

    public int getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(int numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Double getUnCosto() {
        return unCosto;
    }

    public void setUnCosto(Double unCosto) {
        this.unCosto = unCosto;
    }

    public Double getVariosCostos() {
        return variosCostos;
    }

    public void setVariosCostos(Double variosCostos) {
        this.variosCostos = variosCostos;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "numeroSolicitud=" + numeroSolicitud +
                ", fecha=" + fecha +
                ", persona=" + persona +
                ", unCosto=" + unCosto +
                ", variosCostos=" + variosCostos +
                '}';
    }
}
