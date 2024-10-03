public class Main {
    public static void main(String[] args) {
        Candidatos[] politicos1 = new Candidatos[2];
        Candidatos[] politicos2 = new Candidatos[2];
        politicos1[0] = new Candidatos("CLEBER EDSON DOS SANTOS RODRIGUES", "17/10/1953","masc",
                691428.97,true,55,"prefeito");
        politicos1[1] = new Candidatos("JOSUE CARVALHO DE JESUS", "30/08/1983","masc",
                145000.00,false,15,"prefeito");
        politicos2[0] = new Candidatos("BRUNO LOUREIRO FRAGOSO", "23/02/1996","masc",
                194000.00,false,15,"prefeito");
        politicos2[1] = new Candidatos("SILVANA MARIA CAVALCANTE DA COSTA PINTO", "20/03/1963","fem",
                963872.03,true,11,"prefeito");


        Eleicao[] eleicaos = new Eleicao[2];
        eleicaos[1] = new Eleicao("Curralinho",33903,politicos1,politicos1[0]);
        eleicaos[0] = new Eleicao("Flexeiras",9618,politicos2,politicos2[1]);

        for(Eleicao valor: eleicaos){
            valor.mostrarDados();
            System.out.print("\n");
        }

    }
}