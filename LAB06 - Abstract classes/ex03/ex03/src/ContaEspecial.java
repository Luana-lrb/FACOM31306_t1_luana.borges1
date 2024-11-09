public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        if(limite == 0){
            ContaComum c = new ContaComum(saldo,numConta,senha);
        }else this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public ContaCorrente setLimite(float limite) {
        if(limite == 0){
            return new ContaComum(saldo,numConta,senha);
        }
        else this.limite = limite;
        return this;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                ", saldo=" + saldo +
                ", estado=" + estado +
                ", numConta=" + numConta +
                ", senha=" + senha +
                '}';
    }
}
