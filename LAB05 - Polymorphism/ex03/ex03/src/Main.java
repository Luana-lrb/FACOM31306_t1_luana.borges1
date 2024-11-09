public class Main {
    public static void main(String[] args) {
        Estudante[] es = new Estudante[8];
        es[0] = new Estudante("Carlos","Rua 1o de Abril");
        es[1] = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia", "Banco de dados");
        es[2] = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        es[3] = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");
        es[4]= new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        es[5] = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        es[6] = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");


        Universidade UFU = new Universidade("UFU","34/05/1930",es);

        EstudantePosGrad [] posgrads = new EstudantePosGrad[100];

        UFU.contaEstudantes();
        UFU.copiaPosGraduandos(posgrads);
        UFU.imprimeTudo();
    }
}