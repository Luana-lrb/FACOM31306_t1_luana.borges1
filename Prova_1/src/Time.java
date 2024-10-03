public class Time {
    private Jogador titular1;
    private Jogador titular2;
    private Jogador substituto;
    private String nomeDoTime;

    public Time(Jogador titular1, Jogador titular2, String nomeDoTime) {
        this.titular1 = new Jogador(titular1.getNome(), titular1.getIdade(), titular1.getAltura(), titular1.getPeso());
        this.titular2 =new Jogador(titular2.getNome(), titular2.getIdade(), titular2.getAltura(), titular2.getPeso());
        this.nomeDoTime = nomeDoTime;
        this.substituto = null;
    }

    public Time(Jogador titular1, Jogador titular2,Jogador substituto, String nomeDoTime ) {
        this.titular1 = new Jogador(titular1.getNome(), titular1.getIdade(), titular1.getAltura(), titular1.getPeso());
        this.titular2 =new Jogador(titular2.getNome(), titular2.getIdade(), titular2.getAltura(), titular2.getPeso());
        this.nomeDoTime = nomeDoTime;
        this.substituto = new Jogador(substituto.getNome(), substituto.getIdade(), substituto.getAltura(), substituto.getPeso());
    }

    @Override
    public String toString() {
        if(substituto != null ){
            return "Time{" +"\n"+
                    "titular1=" + titular1.toString() +"\n"+
                    ", titular2=" + titular2.toString() +"\n"+
                    ", substituto=" + substituto.toString() +"\n"+
                    ", nomeDoTime='" + nomeDoTime + '\'' +"\n"+
                    '}';
        }else{
            return "Time{" +"\n"+
                    "titular1=" + titular1.toString() + "\n"+
                    ", titular2=" + titular2.toString() +"\n"+
                    ", nomeDoTime='" + nomeDoTime + '\'' +"\n"+
                    '}';
        }
    }

    public double calcIdadeMedia(){
        double media;
        if(substituto != null ){
            media = (titular1.getIdade()+titular2.getIdade()+ substituto.getIdade())/3.0;
        }else{
            media = (titular1.getIdade()+titular2.getIdade())/2.0;
        }
        return media;
    }

}

