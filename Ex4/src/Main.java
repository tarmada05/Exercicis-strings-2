import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();

    if (s.length() < 3) {
        System.out.println(s);
    } else if (s.endsWith("ing")) {
        System.out.println(s + "ly");
    } else {
        System.out.println(s + "ing");
    }
}
