// Adrian Jae Prado CIS-044-32078

import java.util.*;
import java.util.Scanner;

public class SimpleCalculator {
      public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double result = 0;
        char operator = ' ';
        boolean on = true;

        System.out.println("Simple Calculatpr");
        System.out.println("Enter a number or an operator (+, -, *, /, =).");
        System.out.println("Type exit to quit");

        while(on) {
              System.out.print("Input: ");

              if (in.hasNextDouble()){
                if (operator == ' '){
                  num1 = in.nextDouble();
                  System.out.println("Screen: " + num1);
                } else {
                    num2 = in.nextDouble();
                  System.out.println("Screen: " + num2);
                }
              } else {
                String input = in.next();

                if (input.equalsIgnoreCase("exit")) {
                  on = false;
                  System.out.println("Calculator exited.");
                } else if (input.length() == 1){
                  char ch = input.charAt(0);

                  if (ch == '+' || ch == '-' || ch == '*' || ch =='/'){
                    operator = ch;
                    System.out.println("Screen: " + num1);
                  } else if (ch == '='){
                    if (operator == '+') {
                      result = num1 + num2;
                    } else if (operator == '-'){
                      result = num1 - num2;
                    } else if (operator == '*'){
                      result = num1 * num2;
                    } else if (operator == '/'){
                      if (num2 == 0) {
                        System.out.println("Error: Can't divide by 0");
                        continue;
                      }
                      result = num1 / num2;
                    }
                    
                    System.out.println("Screen: " + result);
                    num1 = result;
                    num2 = 0;
                    operator = ' ';
                  } else {
                    System.out.println("Invalid input");
                  }
                }
              }

              System.out.println();

        }
      in.close();
      }
}
/// UML Diagram - Adrian Jae Prado
// +---------------------+
// | Simple Calculator   |
// +---------------------+
// | - num1: double      |
// | - num2: double      |
// | - result: double    |
// | - operator: char    |
// | - on: boolean       |
// +---------------------+
// | main(String[])      |
// +---------------------+

          

                    

                      

      
                    

