public class Empresa {
    public static void main(String[]args) {
        Funcionario[] funcionarios = new Funcionario[8];
        funcionarios[0] = new Chefe("Paulo Sérgio", "12/11/2014", 1400.01);
        funcionarios[1] = new Chefe("Anderso", "02/03/1965", 1.500);
        funcionarios[2] = new Vendedores("Fernandino", "15/07/2009", 800.02, 25.03, 4);
        funcionarios[3] = new Vendedores("Kenji Fujiwara", "13/08/1998",540.50, 12.45,350 );
        funcionarios[4] = new Horistas("Lincon Nunes", "23/05/1997", 789, 1.50);
        funcionarios[5] = new Horistas("Marcão Beiramar", "09/08/2019", 532, 0.273272181);
        funcionarios[6] = new Operarios("Getulio Vargas", "09/12/2023", 0.12, 12);
        funcionarios[7] = new Operarios("Lilian Rodrigues", "18/04/2005", 35,150);

        // O Cálculo do salário está no próprio construtor


        for (Funcionario valor : funcionarios) {
            System.out.println(valor.toString());
        }
    }
}


