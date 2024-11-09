public class Operacao {
    public double iniciarOperacao(int numerador, int denominador)throws DivisaoPorZeroException{
        return calcular(numerador, denominador);
    }
    public double calcular(int numerador, int denominador)throws DivisaoPorZeroException{
        return dividir(numerador, denominador);
    }
    public double dividir(int numerador, int denominador) throws DivisaoPorZeroException {
        if(denominador == 0) throw new DivisaoPorZeroException("Divisão por zero!");
        return (double)numerador/denominador;
    }
}
