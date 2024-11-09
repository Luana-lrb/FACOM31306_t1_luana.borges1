public class Main {
    public static void main(String[] args){
        Operacao operacao = new Operacao();
        double resposta = 0;
        try{
            resposta = operacao.iniciarOperacao(35, 5);
            System.out.println("A resposta é: " + resposta);
        }catch(DivisaoPorZeroException dv){
            System.out.println(dv.getMessage());
        }
        try{
            resposta = operacao.iniciarOperacao(35, 0);
            System.out.println("A resposta é: " + resposta);
        }catch(DivisaoPorZeroException dv){
            System.out.println(dv.getMessage());

        }

    }
}