public class Main {
    public static void main(String[] args) {
        Paciente[] pacientes = new Paciente[2];
        pacientes[0] = new Paciente("Cleber", 78, "Diabetes");
        System.out.println(pacientes[0].toString());
        pacientes[1] = new Paciente("Felicita", 25, "Virose");
        System.out.println(pacientes[1].toString());
        Medico Arnoldo = new Medico("Arnoldo", "Clínico Geral");
        System.out.println(Arnoldo.toString());
        for(Paciente paciente : pacientes){
        if(Arnoldo.consultaGeriatrica(paciente))
            System.out.println("\nO paciente " + paciente.getNome() + " deve ter preferência.");
        }


    }
}