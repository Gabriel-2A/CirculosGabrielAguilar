import static java.lang.Math.PI;

public class Circulo {

    private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcularArea(float radio){
        float area = (float)((2*PI)*radio);
        return area;
    }

    public float calcularDiametro(){

    }

    public float calcularCircunferencia(){

    }
}
