import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de times:");
        int n = sc.nextInt();
        sc.nextLine();
        Time[] times = new Time[n];
        int op;

        for(int i = 0; i < n; i++){
            System.out.print("\nInforme o nome do time:");
            String nomeDoTime = sc.nextLine();

            System.out.print("\nInforme o nome, idade, altura e peso do primeiro titular:");
            String nome1 = sc.nextLine();
            int idade1 = sc.nextInt();
            double altura1 = sc.nextDouble();
            double peso1 = sc.nextDouble();
            Jogador titular1 = new Jogador(nome1,idade1,altura1,peso1);
            sc.nextLine();
            System.out.print("\nInforme o nome, idade, altura e peso do segundo titular:");
            String nome2 = sc.nextLine();
            int idade2 = sc.nextInt();
            double altura2 = sc.nextDouble();
            double peso2 = sc.nextDouble();
            Jogador titular2 = new Jogador(nome2,idade2,altura2,peso2);

            System.out.print("\nHavera substituto?(1 para sim e 0 para não)");
            op = sc.nextInt();
            if(op == 1){
                sc.nextLine();
                System.out.print("\nInforme o nome, idade, altura e peso do substituto:");
                String nomesub = sc.nextLine();
                int idadesub = sc.nextInt();
                double alturasub = sc.nextDouble();
                double pesosub = sc.nextDouble();
                Jogador substituto = new Jogador(nomesub,idadesub,alturasub,pesosub);

                times[i] = new Time(titular1,titular2,substituto,nomeDoTime);
            }else{
                times[i] = new Time(titular1,titular2,nomeDoTime);
            }

            System.out.print(times[i].toString());
            sc.nextLine();
        }
        int indice = 0;
        double maior = times[0].calcIdadeMedia();
        for(int i = 0; i < n; i++){
            if(times[i].calcIdadeMedia() > maior){
                maior = times[i].calcIdadeMedia();
                indice = i;
            }
        }
        System.out.print(times[indice].toString());

        for(int i = 0; i < n; i++){
            times[i]= null;
        }
    }

}
