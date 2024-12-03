import debugg.OperacionesMatem;

public class Main {
    public static void main(String[] args) {
        OperacionesMatem op = new OperacionesMatem();

        int suma = op.calcularSuma(3);
        System.out.println("La suma calculada es: " + suma); // Cambiado por Christian

        int[] numeros = {3, 8, 1, 6, 4, 5};
        int maximo = op.encontrarMaximo(numeros);
        System.out.println("El número máximo es: " + maximo); // Cambiado por Christian
    }
}
