public class Item {
    private String nombreItem;
    private int cantidadSolicitada;
    private String unidadMedida;
    private Double valorUnitario;
    private Double valorTotal;
    private String codigo;

    public Item(String nombreItem, int cantidadSolicitada, String unidadMedida, Double valorUnitario, Double valorTotal, String codigo) {
        this.nombreItem = nombreItem;
        this.cantidadSolicitada = cantidadSolicitada;
        this.unidadMedida = unidadMedida;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.codigo = codigo;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(int cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombreItem='" + nombreItem + '\'' +
                ", cantidadSolicitada=" + cantidadSolicitada +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", valorUnitario=" + valorUnitario +
                ", valorTotal=" + valorTotal +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
