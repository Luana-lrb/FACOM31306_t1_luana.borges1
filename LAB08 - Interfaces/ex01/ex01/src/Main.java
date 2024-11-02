public class Main {
    public static void main (String[] args){
        Classificavel[] clientes = new Cliente[3];
        Classificavel[] produtos = new Produto[3];
        Classificavel[] servicos = new Servico[3];

        clientes[0] = new Cliente("AntonioA");
        clientes[1] = new Cliente("AntonioB");
        clientes[2] = new Cliente("AntonioC");
        produtos[0] = new Produto(996775);
        produtos[1] = new Produto(3431);
        produtos[2] = new Produto(1430);
        servicos[0] = new Servico(124.45);
        servicos[1] = new Servico(34.56);
        servicos[2] = new Servico(44.90);

        Classificador.ordena(clientes);
        Classificador.ordena(produtos);
        Classificador.ordena(servicos);


    }
}
