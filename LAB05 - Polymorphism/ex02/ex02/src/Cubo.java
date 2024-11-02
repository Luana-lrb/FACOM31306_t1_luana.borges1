public class Cubo extends FormaTridimensional{
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double obterArea(){
        return 6*lado*lado;
    }
    public double obterVolume(){
        return Math.pow(lado,3);
    }

    @Override
    public String toString() {
        return super.toString()+"Cubo{" +
                "lado=" + lado +
                '}';
    }
}
