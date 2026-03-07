import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {

        int[] numerosGanadores = { 3, 7, 12, 15, 25, 35 };
        int[] boletoUsuario = new int[6];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tus 6 números (1-49):");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            boletoUsuario[i] = verificarNumeros(scanner.nextInt());
        }
        int aciertos = calcularAciertos(numerosGanadores, boletoUsuario);
        mostrarCategoria(aciertos);
        scanner.close();
    }

    static int calcularAciertos(int[] ganadora, int[] miBoleto) {
        int aciertos = 0;
        for (int i = 0; i < ganadora.length; i++) {
            for (int j = 0; j < miBoleto.length; j++) {
                if (ganadora[i] == miBoleto[j]) {
                    aciertos++;
                }
            }
        }
        return aciertos;

    }

    static int verificarNumeros(int numero) {
        if (numero < 1) {
            System.out.println("El numnero es demasiado pequeño, se ha cambiado a 1 automaticamente");
            return 1;
        } else if (numero > 49) {
            System.out.println("El número es demasiado grande, se ha cambiado a 49 automaticamente");
            return 49;
        }
        return numero;
    }

    static void mostrarCategoria(int aciertos) {
        System.out.println("Has acertado " + aciertos + " números.");
        switch (aciertos) {
            case 6:
                System.out.println("¡Primera categoría!");
                break;
            case 5:
                System.out.println("¡Segunda categoría!");
                break;
            case 4:
                System.out.println("¡Tercera categoría!");
                break;
            default:
                System.out.println("Sin premio");
        }

    }
}