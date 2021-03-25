package Calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//      Taking The Operation
        System.out.println("Calculator");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Operation: ");
        String BO = scan.next();

//      Taking Number Inputs
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        String number1 = num1.nextLine();

//      Performing String Operation
        String[] arrOfStr = number1.split(" ", 15);

//      Processing
        switch (BO) {
            case "add":
                int add_res = 0;
                for (String i : arrOfStr) {
                    add_res += Integer.parseInt(i);
                }

                System.out.println(add_res);

                break;
            case "subtract":
                int sub_res = Integer.parseInt(arrOfStr[0]);

                for(int i=1; i<arrOfStr.length; i++){
                    sub_res -= Integer.parseInt(arrOfStr[i]);
                }

                System.out.println(sub_res);
                break;
            case "multiply":
                int multiply_res = Integer.parseInt(arrOfStr[0]);

                for(int i=1; i<arrOfStr.length; i++){
                    multiply_res *= Integer.parseInt(arrOfStr[i]);
                }

                System.out.println(multiply_res);
                break;
            case "divide":
                int divide_res = Integer.parseInt(arrOfStr[0]);

                for(int i=1; i<arrOfStr.length; i++){
                    divide_res /= Integer.parseInt(arrOfStr[i]);
                }

                System.out.println(divide_res);
                break;
            default:
                System.out.println("Sorry");
                break;
        }
    }
}
