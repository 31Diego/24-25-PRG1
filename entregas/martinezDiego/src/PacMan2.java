import java.util.Scanner;

public class PacMan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mapa = {
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1 },
        };
        
        String direccion;
        System.out.println("Bienvenido a PacMan, inroduce la posicion de salida");
        int posicionJugadorX = scanner.nextInt();
        int posicionJugadorY = scanner.nextInt();
        mapa[posicionJugadorX][posicionJugadorY] = 0;

        moverJugador(mapa);
        imprimirMapa(mapa);

    }

    static void moverJugador(int[][] mapa, int posicionJugadorX, int posicionJugadorY, String direccion) {

    }

    static void imprimirMapa(int[][] mapa) {
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int columna = 0; columna < mapa[fila].length; columna++) {
                String simbolo = convertirASimbolo(mapa[fila][columna]);
                System.out.print(simbolo + " ");
            }
            System.out.println(" ");
        }
    }

    static String convertirASimbolo(int valor) {
        switch (valor) {
            case 0:
                return "P";
            case 1:
                return ".";
            case 2:
                return "E";
            case 3:
                return "#";
            default:
                return " ";
        }
    }

}
