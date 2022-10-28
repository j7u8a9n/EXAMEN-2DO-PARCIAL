public class Almacen {
    private Factura factura;
    private EntradaAlmacen entradaAlmacen;
    private SalidaAlmacen salidaAlmacen;

    public Almacen(Factura factura, EntradaAlmacen entradaAlmacen, SalidaAlmacen salidaAlmacen) {
        this.factura = factura;
        this.entradaAlmacen = entradaAlmacen;
        this.salidaAlmacen = salidaAlmacen;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public EntradaAlmacen getEntradaAlmacen() {
        return entradaAlmacen;
    }

    public void setEntradaAlmacen(EntradaAlmacen entradaAlmacen) {
        this.entradaAlmacen = entradaAlmacen;
    }

    public SalidaAlmacen getSalidaAlmacen() {
        return salidaAlmacen;
    }

    public void setSalidaAlmacen(SalidaAlmacen salidaAlmacen) {
        this.salidaAlmacen = salidaAlmacen;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "factura=" + factura +
                ", entradaAlmacen=" + entradaAlmacen +
                ", salidaAlmacen=" + salidaAlmacen +
                '}';
    }
}
