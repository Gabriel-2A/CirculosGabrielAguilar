public class Main {

    public static void main(String[] args){
        Circulo nada = new Circulo();
        Circulo cr = new Circulo(3.5f);

        System.out.println(cr.calcularArea());
        System.out.println(cr.calcularDiametro());
        System.out.println(cr.calcularCircunferencia());

    }
}
