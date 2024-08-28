import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Listando um vetor em ordem inversa>>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
        }
        System.out.println("A ordem inversa dos números é:");
        for (int i = 4; i >= 0; i--){
            System.out.printf("%d ",vet[i]);
        }

    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor de números pares >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d: ",i+1);

            vet[i] = sc.nextInt();
            if(vet[i]%2!=0){
                System.out.println("Erro: Valor inválido\n");
                i--;
            }
        }

        System.out.println("Os números pares lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }

    }

    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int soma = 0, maior, menor;
        double media = 0;

        System.out.println("<< 5 valores >>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
            soma += vet[i];
        }
        media = soma/5.0;
        maior = menor = vet[0];

        for(int i = 1; i < 5; i++){
            if(vet[i] > maior) maior = vet[i];
            if(vet[i]< menor) menor = vet[i];
        }
        System.out.print("Os valores digitados são: ");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d ",vet[i]);
        }
        System.out.printf("\nO maior valor é: %d\n", maior);
        System.out.printf("O menor valor é: %d\n", menor);
        System.out.printf("A média é: %.2f",media);
    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int soma = 0, maior, posmaior = 0, posmenor = 0, menor;
        double media = 0;

        System.out.println("<< 5 valores >>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
            soma += vet[i];
        }
        media = soma/5.0;
        maior = menor = vet[0];

        for(int i = 1; i < 5; i++){
            if(vet[i] > maior){ maior = vet[i]; posmaior = i;}
            if(vet[i]< menor) {menor = vet[i]; posmenor = i;}
        }
        System.out.print("Os valores digitados são: ");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d ",vet[i]);
        }
        System.out.printf("\nO maior valor é: %d, localizado na posição %d do vetor\n", maior, posmaior);
        System.out.printf("O menor valor é: %d, localizado na posição %d do vetor\n", menor, posmenor);
        System.out.printf("A média é: %.2f",media);
    }

    public static void ex07(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior, posmaior = 0;
        System.out.println("<< Normalizando as notas>>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com a nota do aluno %d: ",i+1);
            vet[i] = sc.nextInt();
        }
        maior = vet[0];
        for(int i = 1; i < 5; i++){
            if(vet[i] > maior) {
                maior = vet[i]; posmaior = i;
            }
        }
        vet[posmaior] = 100;
        for(int i = 0; i < 5; i++){
            if(i != posmaior){
                vet[i] = 100 * vet[i]/ maior;
            }
        }

        System.out.println("\nNotas normalizadas\n");
        for (int i = 0; i < 5; i++){
            System.out.printf("A nota do aluno %d é %d \n",i+1, vet[i]);
        }

    }

    public static void ex08(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int soma = 0;
        double soma_do_desvio = 0.0;
        System.out.println("<< Média e desvio-padrão >>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d: ",i+1);
            vet[i] = sc.nextInt();
            soma += vet[i];
        }
        double media = soma/5.0;
        for(int i = 0; i < 5; i++){
            soma_do_desvio += Math.pow((vet[i] - media),2);
        }
        double desvio_padrao = Math.sqrt(soma_do_desvio / 4.0);
        System.out.printf("A média é: %f e o desvio-padrão é %.13f",media, desvio_padrao);

        sc.close();
    }

    public static void ex09(){
        Scanner sc = new Scanner(System.in);

        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");
        System.out.print("Entre com o número de alunos: ");
        int alunos = sc.nextInt(), soma = 0;
        if(alunos > 100){
            System.out.print("Erro! O número máximo de alunos permitido é 100.");
        }else{
            int[] vet = new int[alunos];
            for (int i = 0; i < alunos; i++){
                System.out.printf("Digite a nota do aluno %d: ",i+1);
                vet[i] = sc.nextInt();
                soma += vet[i];
            }
            double media = soma/(alunos*1.0);
            System.out.println("\nRelatório de Notas");
            for (int i = 0; i < alunos; i++){
                System.out.printf("A nota do aluno %d é: %d \n",i, vet[i]);
            }
            System.out.printf("A média da turma é: %.1f",media);
        }

    }



    public static void main(String[] args) {
        //ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();

    }




}
