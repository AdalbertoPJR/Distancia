import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dist = teclado.nextInt();
        int min = (60 * dist) / 30;

        System.out.println(min + " minutos");

        teclado.close();
    }
}
