public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double obterArea(){
        return lado*lado;
    }

    @Override
    public String toString() {
        return super.toString()+"Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
