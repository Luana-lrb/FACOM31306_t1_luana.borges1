public class Comodo {
    private String tipo;
    private int numJanelas;
    private int numMoveis;
    private double area;

    public Comodo(String tipo, int numJanelas, int numMoveis, double area) {
        this.tipo = tipo;
        this.numJanelas = numJanelas;
        this.numMoveis = numMoveis;
        this.area = area;
    }

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}

    public int getNumJanelas() {return numJanelas;}

    public void setNumJanelas(int numJanelas) {this.numJanelas = numJanelas;}

    public int getNumMoveis() {return numMoveis;}

    public void setNumMoveis(int numMoveis) {this.numMoveis = numMoveis;}

    public double getArea() {return area;}

    public void setArea(double area) {this.area = area;}

    @Override
    public String toString() {
        return "\nComodo{" +
                "tipo='" + tipo + '\'' +
                ", numJanelas=" + numJanelas +
                ", numMoveis=" + numMoveis +
                ", area=" + area +
                "}";
    }
}
