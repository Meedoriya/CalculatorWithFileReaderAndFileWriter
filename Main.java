import java.io.*;
import java.util.Scanner;

class Main {
    static public void main (String []args) throws Exception{
        Scanner sc = new Scanner (System.in);
        String line = sc.nextLine();
        sc.close();
        double a = 0.0;
        double b = 0.0;
        char operation = ' ';
        int m=0;
        boolean is = true;
        for (String num : line.split(" ")) {
            m++;
            if (m == 1) {
                try {
                    a = Double.valueOf(num);
                } catch(NumberFormatException e) {
                    System.out.print("Error! Not number\n");
                    is = false;
                    break;
                }
            }
            if (m == 3) {
                try {
                    b = Double.valueOf(num);
                } catch(NumberFormatException e) {
                    System.out.print("Error! Not number\n");
                    is = false;
                    break;
                }
            }
        }
        if (is) {
            m = 0;
            for (String num : line.split(" ")) {
                m++;
                if(m==2) {
                    try {
                        operation = result(num, operation);
                    } catch(Exception s) {
                        System.out.print("Operation Error!");
                        is = false;
                        break;
                    }
                }
            }
        }
        if (is) {
            switch(operation){
                case('+') : System.out.print(a + b);
                    break;
                case('-') : System.out.print(a - b);
                    break;
                case('/') :
                    if (b == 0.0) System.out.print("Error! Division by zero");
                    else     System.out.print(a / b);
                    break;
                case('*'): System.out.print(a * b);
                    break;
            }
        }

    }
    public static char result(String nms, char operation) throws Exception {
        if (nms.equals("/") || nms.equals("*") || nms.equals("+") || nms.equals("-")) {
            operation = nms.charAt(0);
            return operation;
        }
        else throw new Exception("OperationError");
    }
}