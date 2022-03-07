import static java.lang.Math.PI;

public class Circulo {

    private float radio;

    public Circulo(){
        System.out.println("No sirvo para nada");
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcularArea(){
        float area = (float)(PI*Math.pow(radio, 2));
        return area;
    }

    public float calcularDiametro(){
        float diametro = (radio*2);
        return diametro;
    }

    public float calcularCircunferencia(){
        float circunferencia = (float)((2*PI)*radio);
        return circunferencia;
    }

    @Override
    public String toString() {
        return "\nRadio = " + radio +
                "\nArea = " + calcularArea() +
                "\nDiametro = " + calcularDiametro() +
                "\nCircunmferencia = " + calcularCircunferencia();
    }
}
