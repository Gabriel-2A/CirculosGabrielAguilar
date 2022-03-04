public class Main {

    public static void main(String[] args){
        Circulo nada = new Circulo();
        Circulo cr = new Circulo(3.5f);

        System.out.println("Area -> " + cr.calcularArea());
        System.out.println("Diametro -> " + cr.calcularDiametro());
        System.out.println("Circunferencia -> " + cr.calcularCircunferencia());

    }
}
