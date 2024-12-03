package debugg;

public class OperacionesMatem {
    // Método calcularSuma: método que suma los n primeros numeros.
    public int calcularSuma(int n) {
        int suma = 0;
        for (int i = 0; i <=n; i++) {
            suma += i;
        }

        return suma;
    }

   // Método encontrarMaximo: Encuentra el máximo de un arreglo de enteros.
    public int encontrarMaximo(int[] arr) {
        int maximo = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }
}
