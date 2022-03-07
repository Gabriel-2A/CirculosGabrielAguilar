public class Main {

    public static void main(String[] args){
        Circulo nada = new Circulo();
        Circulo cr = new Circulo(5.5678f);

        /*System.out.println("Area -> " + cr.calcularArea());
        System.out.println("Diametro -> " + cr.calcularDiametro());
        System.out.println("Circunferencia -> " + cr.calcularCircunferencia());*/

        System.out.println(cr.toString());

    }
}
