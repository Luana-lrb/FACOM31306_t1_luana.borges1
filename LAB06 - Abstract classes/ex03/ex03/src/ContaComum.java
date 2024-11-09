public class ContaComum extends ContaCorrente{
    public ContaComum(float val, int num, int pwd) {
        super(val, num, pwd);
    }

    @Override
    public String toString() {
        return "ContaComum{" +
                "saldo=" + saldo +
                ", estado=" + estado +
                ", numConta=" + numConta +
                ", senha=" + senha +
                '}';
    }
}
