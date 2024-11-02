public class Esfera extends FormaTridimensional{
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double obterArea(){
        return 4* Math.PI* Math.pow(raio,2);
    }
    public double obterVolume(){
        return (4/3.0)*Math.PI*Math.pow(raio,3);
    }

    @Override
    public String toString() {
        return super.toString()+"Esfera{" +
                "raio=" + raio +
                '}';
    }
}
