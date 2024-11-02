public class Main {
    public static void main(String[] args) {

       Normal ingresso =  new Normal();

       VIP camInf = new CamaroteInferior(259.99,45.50,"Juquiá 596, Centro, SP");
       VIP camSup = new CamaroteSuperior(459.99, 69.99, 129.90, "Jericoacoara 33, Leste, Nova Zelândia ");

       ingresso.escreveValor(350.50);

       ingresso.ingressoNormal();
        System.out.println("Valor do camarote Inferior: "+ camInf.retornaValor());
        System.out.println("Valor do camarote Superior: "+ camSup.retornaValor());

        System.out.println(camInf.toString());
        System.out.println(camSup.toString());



    }
}