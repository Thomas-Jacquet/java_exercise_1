import java.util.Scanner;

public class Launcher {

    public static int fibo(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        if (n == 1)
        {
            return 1;
        }
        int a = 0;
        int b = 1;
        int t = 0;
        while (n > 1)
        {
            t = a + b;
            a = b;
            b = t;
            n--;
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println("Bienvenue !");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("quit"))
        {
            if (input.equals("fibo")) {
                System.out.println(Launcher.fibo(scanner.nextInt()));
                scanner.nextLine(); // because nextInt doesnt read the \n
            }
            else {
                System.out.println("Unknown command");
            }
            input = scanner.nextLine();
        }
    }
}
