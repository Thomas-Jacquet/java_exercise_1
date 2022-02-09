import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue !");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("quit"))
        {
            System.out.println("Unknown command");
            input = scanner.nextLine();
        }
    }
}
