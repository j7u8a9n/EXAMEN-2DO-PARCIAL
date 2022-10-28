public class Bienysum {
    private Compras compras;
    private Almacen almacen;
    private Inventario inventario;

    public Bienysum(Compras compras, Almacen almacen, Inventario inventario) {
        this.compras = compras;
        this.almacen = almacen;
        this.inventario = inventario;
    }

    public Compras getCompras() {
        return compras;
    }

    public void setCompras(Compras compras) {
        this.compras = compras;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Bienysum{" +
                "compras=" + compras +
                ", almacen=" + almacen +
                ", inventario=" + inventario +
                '}';
    }
}
