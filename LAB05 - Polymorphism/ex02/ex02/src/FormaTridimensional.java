public abstract class FormaTridimensional extends Forma{
    public FormaTridimensional() {
    }

    @Override
    public String toString() {
        return super.toString()+"FormaTridimensional:";
    }
    public abstract double obterArea();
    public abstract double obterVolume();
}
