import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        String path1 = separator + "Users" + separator + "DELL" + separator + "Desktop" + separator + "input.txt";
        String path2 = separator + "Users" + separator + "DELL" + separator + "Desktop" + separator + "output.txt";
        File file = new File(path1);
        Scanner sc1 = new Scanner(file);
        Scanner sc2 = new Scanner(file);
        FileWriter fw = new FileWriter(path2);
        while (sc1.hasNext()) {
            try {
                double a = sc1.nextDouble();
                String op = sc1.next();
                double b = sc1.nextDouble();
                String ops = "+-*/";
                String result = "";
                if (!ops.contains(op)) result = "Operation Error!";
                switch (op) {
                    case "+": result = Double.toString(a + b); break;
                    case "-": result = Double.toString(a - b); break;
                    case "*": result = Double.toString(a * b); break;
                    case "/": result = (b == 0 ? "Error! Division by zero" : Double.toString(a / b)); break;
                }
                fw.append(sc2.nextLine() + " = " + result + "\n");
                fw.flush();
            } catch (Exception ex) {
                fw.append(sc2.nextLine() + " = " + "Error! Not number" + "\n");
                fw.flush();
                sc1.nextLine();
            }
        }
        fw.close(); sc1.close(); sc2.close();
    }
}