import debugg.OperacionesMatem;

public class Main {
    public static void main(String[] args) {
        OperacionesMatem op = new OperacionesMatem();

        int suma = op.calcularSuma(3);
        System.out.print("La suma calculada es: " + suma); // Cambiado por Javier

        int[] numeros = {3, 8, 1, 6, 4, 5};
        int maximo = op.encontrarMaximo(numeros);
        System.out.print("El número máximo es: " + maximo); // Cambiado por Javier
    }
}
