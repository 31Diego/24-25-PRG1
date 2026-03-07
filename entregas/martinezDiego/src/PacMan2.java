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
        int[] posicionJugador = { 3, 3 };

        boolean jugando = true;
        System.out.println("Bienvenido a PacMan, presiona enter para empezar, te mueves con wasd ");
        scanner.nextLine();
        while (jugando) {
            System.out.println("introduce wasd");
            direccion = scanner.nextLine();
            moverJugador(mapa, posicionJugador, direccion);
            imprimirMapa(mapa);

        }
6
    }

    static void moverJugador(int[][] mapa, int[] posicionJugador, String direccion) {
        int nuevaPosicionJugadorX = posicionJugador[0];
        int nuevaPosicionJugadorY = posicionJugador[1];
        switch (direccion) {
            case "w":
                nuevaPosicionJugadorX--;
                break;
            case "s":
                nuevaPosicionJugadorX++;
                break;
            case "a":
                nuevaPosicionJugadorY--;
                break;
            case "d":
                nuevaPosicionJugadorY++;
                break;
            default:
                System.out.println("Direccion invalida");
                return;
        }

        if (nuevaPosicionJugadorX < 0 || nuevaPosicionJugadorX >= mapa.length || nuevaPosicionJugadorY < 0
                || nuevaPosicionJugadorY >= mapa[0].length) {
            System.out.println("Fuera de mapa");
            return;
        }

        mapa[posicionJugador[0]][posicionJugador[1]] = 1;
        mapa[nuevaPosicionJugadorX][nuevaPosicionJugadorY] = 0;
        posicionJugador[0] = nuevaPosicionJugadorX;
        posicionJugador[1] = nuevaPosicionJugadorY;

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
