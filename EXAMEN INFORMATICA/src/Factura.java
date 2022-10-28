import java.util.Date;

public class Factura {
    private int numeroEntrada;
    private Date fecha;
    private int numeroFactura;
    private Proveedores proveedores;
    private int totalBienes;
    private Double valorTotal;

    public Factura(int numeroEntrada, Date fecha, int numeroFactura, Proveedores proveedores, int totalBienes, Double valorTotal) {
        this.numeroEntrada = numeroEntrada;
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        this.proveedores = proveedores;
        this.totalBienes = totalBienes;
        this.valorTotal = valorTotal;
    }

    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(int numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    public int getTotalBienes() {
        return totalBienes;
    }

    public void setTotalBienes(int totalBienes) {
        this.totalBienes = totalBienes;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numeroEntrada=" + numeroEntrada +
                ", fecha=" + fecha +
                ", numeroFactura=" + numeroFactura +
                ", proveedores=" + proveedores +
                ", totalBienes=" + totalBienes +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
