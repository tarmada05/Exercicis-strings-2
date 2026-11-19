import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    String cadena = input.nextLine();
    int[] contador = new int[256];

    for (int i = 0; i < cadena.length(); i++) {
        char c = cadena.charAt(i);
        if (c != ' ') {
            contador[c]++;
        }
    }

    for (int i = 0; i < contador.length; i++) {
        if (contador[i] > 0) {
            System.out.println((char) i + ": " + contador[i]);
        }
    }
}
