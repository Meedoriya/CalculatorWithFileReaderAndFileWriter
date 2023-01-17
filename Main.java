import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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