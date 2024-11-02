public class Tetraedro extends FormaTridimensional{
    private double lado;
    private double altura;

    public Tetraedro(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double obterArea(){
        return Math.pow(lado,2)*Math.sqrt(3);
    }
    public double obterVolume(){
        return (1/3.0)*(obterArea()/4) * altura;
    }

    @Override
    public String toString() {
        return super.toString()+"Tetraedro{" +
                "lado=" + lado +
                ", altura=" + altura +
                '}';

    }
}
