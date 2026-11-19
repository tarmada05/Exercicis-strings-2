import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();

    if (s.length() < 2) {
        System.out.println("");
    } else {
        System.out.println(s.substring(0, 2) + s.substring(s.length() - 2));
    }
}
