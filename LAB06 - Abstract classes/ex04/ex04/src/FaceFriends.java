import java.util.Objects;
import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contato[] contatos = new Contato[10];
        int op, quantContatos = 0, indice;
        String contatoTipo;
        do {
            System.out.print("\n========== MENU =========="+
                                "\n1) Inserir um contato" +
                                "\n2) Imprimir todos os contatos" +
                                "\n3) Imprimir somente os familiares" +
                                "\n4) Imprimir somente os amigos" +
                                "\n5) Imprimir somente os colegas de trabalho" +
                                "\n6) Imprimir os melhores amigos, os irmãos e os colegas de trabalho" +
                                "\n7) Imprimir os dados de um único contato" +
                                "\n8) Encerrar\n=> ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Informe o tipo do contato: ");
                    contatoTipo = sc.next();
                    contatoTipo = contatoTipo.toUpperCase();
                    if(quantContatos >= 10) break;

                    if(contatoTipo.equals("FAMILIA") || contatoTipo.equals("AMIGOS") || contatoTipo.equals("TRABALHO")) {
                        System.out.println("Informe as seguintes informações do contato");
                        System.out.print("Nome: ");
                        String nome = sc.next();
                        System.out.print("Apelido: ");
                        String apelido = sc.next();
                        System.out.print("E-mail: ");
                        String email = sc.next();
                        System.out.print("Aniversário: ");
                        String aniversario = sc.next();

                        switch (contatoTipo) {
                            case "FAMILIA":
                                System.out.print("Parentesco: ");
                                String parentesco = sc.next();
                                contatos[quantContatos] = new Familia(nome, apelido, email, aniversario, parentesco);
                                quantContatos++;
                                break;
                            case "AMIGOS":
                                System.out.print("Grau: ");
                                short grau = sc.nextShort();
                                sc.nextLine();
                                contatos[quantContatos] = new Amigos(nome, apelido, email, aniversario, grau);
                                quantContatos++;
                                break;
                            case "TRABALHO":
                                System.out.print("Tipo: ");
                                String tipo = sc.next();
                                contatos[quantContatos] = new Trabalho(nome, apelido, email, aniversario, tipo);
                                quantContatos++;
                                break;
                        }
                    }
                    break;
                case 2:
                    for(Contato contato: contatos){
                        if(contato != null) System.out.println(contato.imprimirContato());
                    }
                    break;
                case 3:
                    for(Contato contato: contatos){
                        if(contato != null) if(contato instanceof Familia) System.out.println(contato.imprimirContato());
                    }
                    break;
                case 4:
                    for(Contato contato: contatos){
                        if(contato != null) if(contato instanceof Amigos) System.out.println(contato.imprimirContato());
                    }
                    break;
                case 5:
                    for(Contato contato: contatos){
                        if(contato != null) if(contato instanceof Trabalho)
                            if(Objects.equals(((Trabalho) contato).getTipo(), "colega"))
                                System.out.println(contato.imprimirContato());
                    }
                    break;
                case 6:
                    for(Contato contato: contatos){
                        if(contato != null) {
                            if (contato instanceof Trabalho) {
                                if (Objects.equals(((Trabalho) contato).getTipo(), "colega"))
                                    System.out.println(contato.imprimirContato());
                            } else if (contato instanceof Amigos) {
                                if (Objects.equals(((Amigos) contato).getGrau(), 1))
                                    System.out.println(contato.imprimirContato());
                            } else if (contato instanceof Familia) {
                                if (Objects.equals(((Familia) contato).getParentesco(), "irmão"))
                                    System.out.println(contato.imprimirContato());
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Informe o indice do contato: ");
                    indice = sc.nextInt();
                    if (contatos[indice] instanceof Trabalho) System.out.println("É um contato do tipo Trabalho: ");
                    if (contatos[indice] instanceof Amigos) System.out.println("É um contato do tipo Amigos: ");
                    if (contatos[indice] instanceof Familia) System.out.println("É um contato do tipo Familia: ");
                    System.out.println(contatos[indice].imprimirContato());
                    break;
                case 8:
                    System.out.println("Encerrando...");
                    break;
            }

        }while(op != 8);

    }
}