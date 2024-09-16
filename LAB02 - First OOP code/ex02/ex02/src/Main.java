public class Main {
    public static void main(String[] args) {
        CandidatoEncapsulado  darlan = new CandidatoEncapsulado();
        darlan.setNome("DARLAN FREITAS PEREIRA");
        darlan.setDataNasc("29/05/1986");
        darlan.setGenero("masc");
        darlan.setCargo("Prefeito");
        darlan.setBens(587813.23);
        darlan.setReeleicao(false);
        darlan.setNmrPartido(40);



        CandidatoEncapsulado ilson = new CandidatoEncapsulado();
        ilson.setNome("ILSON TOLFO TONDO");
        ilson.setDataNasc("18/11/1958");
        ilson.setGenero("masc");
        ilson.setCargo("Prefeito");
        ilson.setBens(680635.69);
        ilson.setReeleicao(false);
        ilson.setNmrPartido(12);


        CandidatoEncapsulado patricia = new CandidatoEncapsulado();
        patricia.setNome("PATRICIA SANTOS DE CASTRO");
        patricia.setDataNasc("19/08/1976");
        patricia.setGenero("fem");
        patricia.setCargo("Prefeito");
        patricia.setBens(65000.00);
        patricia.setReeleicao(false);
        patricia.setNmrPartido(13);

        darlan.panfleto();
        ilson.panfleto();
        patricia.panfleto();


    }
}