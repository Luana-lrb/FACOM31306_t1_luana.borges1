public class Main {
    public static void main(String[] args) {

        Candidatos[] politicos = new Candidatos[3];

        politicos [0] = new Candidatos("DARLAN FREITAS PEREIRA", "29/05/1986",
                    "masc", 587813.23, false, 40, "Prefeito");

        politicos [1] = new Candidatos("ILSON TOLFO TONDO", "18/11/1958",
                    "masc", 680635.69,false, 12, "Prefeito");

        politicos [2] = new Candidatos("PATRICIA SANTOS DE CASTRO", "19/08/1976",
                    "fem", 65000.00,false, 13, "Prefeito");

        for (Candidatos valor : politicos){
            System.out.println(valor.nome+ ": nascido em " + valor.dataNasc + ", " + valor.genero + ". Possui " + valor.bens +
                    " reais. É candidato à reeleição? " + valor.reeleicao + ". O número do partido é: " + valor.nmrPartido +
                    " e concorre a " + valor.cargo + ".");

        }
    }
}