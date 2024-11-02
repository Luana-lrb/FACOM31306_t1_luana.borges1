public class FolhaDePagamento {
    private Funcionario[] funcionarios;

    public FolhaDePagamento(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void mostrarFolha() {
        System.out.println("Folha de Pagamento:");
        for (Funcionario empregado : funcionarios) {
            System.out.println("Nome: " + empregado.getNome() + " - Salário: " + empregado.calcularSalario());
        }

    }
}