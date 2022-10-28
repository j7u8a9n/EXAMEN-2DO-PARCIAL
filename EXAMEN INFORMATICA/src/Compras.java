public class Compras {
    private Solicitud solicitud;

    public Compras(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "solicitud=" + solicitud +
                '}';
    }
}
