public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double obterArea(){
        return Math.PI* Math.pow(raio,2);
    }

    @Override
    public String toString() {
        return super.toString()+"Circulo{" +
                "raio=" + raio +
                '}';
    }
}
