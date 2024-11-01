public class Main {
    public static void main(String[] args) {
        CandidatoPrefeito prefeito = new CandidatoPrefeito("Garibaldo Vasconcelos Dutra", "09/11/1978", "Masculino", 54.000,true,41,"Antonio Carlos Peres", 41);
        CandidatoVereador vereador = new CandidatoVereador("Eduarda Dias Brandão", "25/02/1998", "Feminino",3.600,false,21,"975","Centro");

        System.out.println(prefeito.toString());
        System.out.println(vereador.toString());


    }
}