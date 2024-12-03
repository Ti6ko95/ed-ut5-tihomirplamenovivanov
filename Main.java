import debugg.OperacionesMatem;

public class Main {
    public static void main(String[] args) {
        OperacionesMatem op=new OperacionesMatem();
        int suma=op.calcularSuma(3);
        int[] numeros = {3, 8, 1, 6, 4} ;
        int maximo=op.encontrarMaximo(numeros);
    }
}