public class Main {
    public static void main(String[] args) {

        Comodo[] comodos = new Comodo[4];

        comodos[0] = new Comodo("Sala",1,3,12.36);
        comodos[1] = new Comodo("Banheiro",1,1,2.0);
        comodos[2] = new Comodo("Cozinha",0,5,3.5);
        comodos[3] = new Comodo("Quarto",1,3,10.0);

        Casa casas = new Casa(250, "Av. Ana Rita, Centro", comodos);

        System.out.println(casas.toString());


    }
}