public class Main {
    public static void main(String[] args) {
    C1 c1 = new C1();
    C2 c2 = new C2();
    C3 c3 = new C3();

    C1 c4 = new C1("Jorge", 23, "Programador");
    C2 c5 = new C2("Joana", 56, "Confeiteira", "Cristã", 100, "Observar pássaros");
    C3 c6 = new C3("Cleiton", 14, "Estudante", "Cristão", 73, "Blogueiro", "Pernambucano", "Solteiro", "roxo");

        System.out.println(c4.mostrar_atributos());
        System.out.println(c5.mostrar_atributos());
        System.out.println(c5.mostar_atributos_super());
        System.out.println(c6.mostrar_atributos());
        System.out.println(c6.mostrar_atributos_super());

    }
}