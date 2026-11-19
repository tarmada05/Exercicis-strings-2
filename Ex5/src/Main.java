import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();

    String[] palabras = new String[n];
    for (int i = 0; i < n; i++) {
        palabras[i] = input.nextLine();
    }

    String masLarga = palabras[0];
    for (int i = 1; i < palabras.length; i++) {
        if (palabras[i].length() > masLarga.length()) {
            masLarga = palabras[i];
        }
    }

    System.out.println(masLarga + " (" + masLarga.length() + ")");
}
