public class UsaBanco {
    public static void main(String[] args) {
        ContaCorrente [] contas = new ContaCorrente[2];
        contas[0] = new ContaEspecial(5099245,2,3422344,2333);
        contas[1] = new ContaComum(23311, 1, 467785);

        for(ContaCorrente iteracao: contas){
            System.out.println(iteracao.toString());
        }

        //contas[0] = ((ContaEspecial)contas[0]).setLimite(0);
        contas[0].debitaValor(560);
        contas[1].debitaValor(334, 467785);

        for(ContaCorrente iteracao: contas){
            System.out.println(iteracao.toString());
        }
    }
}
