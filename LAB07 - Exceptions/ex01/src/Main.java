public class Main {
    public static void main(String[] args) {
        Funcionario jorge = new Funcionario("44335566", "Jorge Perez", 13355);
        System.out.println(jorge.toString());

        try {
            jorge.aumentarSalario(755);
        }catch (Excecao ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(jorge.toString());

        try {
            jorge.aumentarSalario(-7500);
        }catch (Excecao ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(jorge.toString());


    }
}