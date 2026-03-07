
public class EscalaArcordes {
    public static void main(String[] args) {

        String[] notas = { "do", "do#", "re", "re#", "mi", "fa", "fa#", "sol", "sol#", "la" };

        System.out.println(" Selecciona una nota: ");

        boolean jugando = true;
        while (jugando) {
            for (int i = 0; i < notas.length; i++) {
                System.out.println("nota: " + " " + notas[i]);
            }
        }

    }
}