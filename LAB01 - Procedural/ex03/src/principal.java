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
        double media;

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
        double media;

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

    public static void ex10(){
        Scanner sc = new Scanner(System.in);
        int[] vetA = new int[3];
        int[] vetB = new int[3];
        int[] vetC = new int[3];
        System.out.println("<< Subtração de vetores >>");
        for (int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de A: ",i+1);
            vetA[i] = sc.nextInt();
        }
        System.out.print("\n");
        for (int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de B: ",i+1);
            vetB[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++){
            vetC[i] = vetA[i] - vetB[i];
        }

        System.out.printf("\nO vetor C, definido como C = A - B é (%d,%d,%d)",vetC[0],vetC[1],vetC[2]);
    }

    public static void ex11(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int aux1 = 0, aux2 = 0;

        System.out.println("<< Pares e Ímpares >>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d: ",i+1);
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++){
            if(vet[i]%2 == 0) {
                vet2[aux2] = vet[i];
                aux2++;
            }else {
                vet1[aux1] = vet[i];
                aux1++;
            }
        }

        System.out.print("\nÍmpares: ");
        for (int i = 0; i < aux1; i++){
            System.out.printf("%d",vet1[i]);
        }
        System.out.print("\nPares: ");
        for (int i = 0; i < aux2-1; i++){
            System.out.printf("%d,",vet2[i]);
        }
        System.out.printf("%d", vet2[aux2-1]);
    }

    public static void ex12(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[4];
        System.out.print("<< Probabilidades >>");
        System.out.println("Digite a quantidade de bolinhas");
        int verde, azul, amarela,vermelha;
        System.out.print("Verde: ");
        verde = sc.nextInt();
        vet[0] = verde;
        System.out.print("Azul: ");
        azul = sc.nextInt();
        vet[1] = azul;
        System.out.print("Amarela: ");
        amarela = sc.nextInt();
        vet[2] = amarela;
        System.out.print("Vermelha: ");
        vermelha = sc.nextInt();
        vet[3] = vermelha;
        int soma = verde + azul + amarela + vermelha;
        double[] vetp = new double[4];
        double maior, posmaior = 0;
        System.out.println("\nProbabilidades");
        for(int i = 0; i < 4; i++){
            vetp[i] = 100*vet[i]/(soma*1.0);
        }
        maior = vetp[0];
        for(int i = 0; i < 4; i++){
            if(vetp[i] > maior) {
                maior = vetp[i];
                posmaior = i;
            }
        }
        System.out.print("Verde: ");
        if(posmaior == 0)  System.out.printf("%.1f%c <<maior probabilidade",vetp[0],'%');
        else System.out.printf("%.1f%c ",vetp[0],'%');
        System.out.print("\nAzul: ");
        if(posmaior == 1)  System.out.printf("%.1f%c <<maior probabilidade",vetp[1], '%');
        else System.out.printf("%.1f%c ",vetp[1],'%');
        System.out.print("\nAmarela: ");
        if(posmaior == 2)  System.out.printf("%.1f%c <<maior probabilidade",vetp[2],'%');
        else System.out.printf("%.1f%c ",vetp[2],'%');
        System.out.print("\nVermelha: ");
        if(posmaior == 3)  System.out.printf("%.1f%c <<maior probabilidade",vetp[3],'%');
        else System.out.printf("%.1f%c ",vetp[3],'%');

    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Zerando negativos >>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++){
            if(vet[i] < 0) vet[i] = 0;
        }
        System.out.print("Zerando os negativos, obtém-se: ");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d ", vet[i]);
        }

    }

    public static void ex14(){
        Scanner sc = new Scanner(System.in);
        int tam;
        System.out.println("<< Universidade X>>");
        System.out.print("Quantos alunos serão cadastrados: ");
        tam = sc.nextInt();
        if(tam > 1000){
            System.out.print("Erro! O número máximo de alunos permitido é 1000.");
        }else{
            int[] alunos = new int[tam];
            char[] classeSocial= new char[tam];
            double[] cRA= new double[tam];

            for(int i = 0; i < tam; i++){
                System.out.print("\nEntre com o número do aluno: ");
                alunos[i]= sc.nextInt();
                System.out.print("Entre com a classe social do aluno: ");
                classeSocial[i]= sc.next().charAt(0);
                System.out.print("Entre com o número do aluno: ");
                cRA[i]= sc.nextDouble();

            }
            System.out.println("\n==== Alunos Cadastrados ==== ");
            for(int i = 0; i < tam; i++){
                System.out.printf("Número: %d Classe Social: %c CRA: %.2f\n", alunos[i],classeSocial[i],cRA[i]);
            }

        }


    }

    public static void ex15(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Valores iguais >>");
        int[] vet = new int[8];
        int[] repete = new int[8];
        int aux = 0;
        for(int i = 0; i < 8; i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (vet[i] == vet[j]) {
                    int cont = 0;
                    for (int k = 0; k < 8; k++) {
                        if(repete[k]==vet[i]){
                        cont = 1;
                        break;
                        }
                    }
                    if (cont == 0) {
                        repete[aux] = vet[i];
                        aux++;
                    }
                    break;
                }
            }
        }
        System.out.print("\nValores repetidos: ");
        for (int i = 0; i < aux-1; i++) {
            System.out.printf("%d, ", repete[i]);
        }
        System.out.printf("%d ", repete[aux-1]);
    }

    public static void ex16(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Valores iguais >>");
        int[] vet = new int[8];
        int[] repete = new int[8];
        for(int i = 0; i < 8; i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            repete[i] = -1;
        }
        for (int i = 0; i < 8; i++) {
            int count = 1;
            for (int j = i + 1; j < 8; j++) {
                if (vet[i] == vet[j]) {
                    count++;
                    repete[j] = 0;
                }
            }
            if (repete[i] != 0) {
                repete[i] = count;
            }
        }
        System.out.println("\nValores repetidos:");
        int temIgual = 0;
        for (int i = 0; i < 8; i++) {
            if (repete[i] > 1) {
                System.out.printf("%d aparece %d vezes \n",vet[i], repete[i]);
                temIgual = 1;
            }
        }
        if (temIgual == 0) {
            System.out.println("Não existem valores iguais no vetor.");
        }
    }

    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
        ex08();
        ex09();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        ex15();
        ex16();


    }




}
