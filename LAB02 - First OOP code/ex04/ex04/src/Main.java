public class Main {
    public static void main(String[] args) {
        Candidatos  darlan = new Candidatos("DARLAN FREITAS PEREIRA", "29/05/1986",
                "masc", 587813.23, false, 40, "Prefeito");

        Candidatos ilson = new Candidatos("ILSON TOLFO TONDO", "18/11/1958",
                "masc", 680635.69,false, 12, "Prefeito");

        Candidatos patricia = new Candidatos("PATRICIA SANTOS DE CASTRO", "19/08/1976",
                "fem", 65000.00,false, 13, "Prefeito");

        darlan.panfleto();
        ilson.panfleto();
        patricia.panfleto();
    }
}