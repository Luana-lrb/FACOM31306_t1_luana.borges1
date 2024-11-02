public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[6];
        formas[0] = new Circulo(3.5);
        formas[1] = new Cubo(4);
        formas[2] = new Esfera(5);
        formas[3] = new Quadrado(6);
        formas[4] = new Tetraedro(4,5);
        formas[5] = new Triangulo(5,6);

        for(Forma forma: formas){
            System.out.println(forma.toString());
            if(forma instanceof FormaBidimensional)
                System.out.println("Área: "+((FormaBidimensional) forma).obterArea());
            else if(forma instanceof FormaTridimensional) {
                System.out.println("Área: "+((FormaTridimensional) forma).obterArea());
                System.out.println("Volume: "+((FormaTridimensional) forma).obterVolume());
            }
        }

    }
}