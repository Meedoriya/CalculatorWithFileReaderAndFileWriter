import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "DELL" + separator + "Desktop" + separator + "input.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        Scanner sc = new Scanner(System.in);
        try {
            double a = sc.nextDouble();
            String op = sc.next();
            double b = sc.nextDouble();
            sc.close();
            String ops = "+-*/";
            if (!ops.contains(op)) System.out.println("Operation Error!");
            switch(op) {
                case "/": System.out.println(b == 0 ? "Error! Division by zero" : a / b); break;
                case "+": System.out.println(a + b); break;
                case "-": System.out.println(a - b); break;
                case "*": System.out.println(a * b); break;
            }
        }
        catch (Exception ex) {
            System.out.println("Error! Not number");
        }
    }
}