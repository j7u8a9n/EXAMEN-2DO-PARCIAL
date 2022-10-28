public class Educando {
    Bienysum bienysuministros;

    public Educando(Bienysum bienysuministros) {
        this.bienysuministros = bienysuministros;
    }

    public Bienysum getBienysuministros() {
        return bienysuministros;
    }

    public void setBienysuministros(Bienysum bienysuministros) {
        this.bienysuministros = bienysuministros;
    }

    @Override
    public String toString() {
        return "Educando{" +
                "bienysuministros=" + bienysuministros +
                '}';
    }
}
