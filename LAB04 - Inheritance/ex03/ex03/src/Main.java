public class Main {
    public static void main(String[] args) {
        CandidatoPrefeito prefeito = new CandidatoPrefeito("Garibaldo Vasconcelos Dutra", "09/11/1978", "Masculino", 54.000,true,41,"Antonio Carlos Peres", 41);
        CandidatoVereador vereador = new CandidatoVereador("Eduarda Dias Brandão", "25/02/1998", "Feminino",3.600,false,21,"975","Centro");

        Candidato c = new Candidato("Wanderson Oliveira Silva", "07/03/1987","Masculino", 220.546, false, 13);
        CandidatoVereador vereador1 = new CandidatoVereador(c,"222","Saraiva");

        System.out.println(prefeito.toString());
        System.out.println(vereador.toString());
        System.out.println(c.toString());
        System.out.println(vereador1.toString());

    }
}