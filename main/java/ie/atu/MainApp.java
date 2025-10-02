//Paul Daly - G00470372
//OOP Week 3
//

package ie.atu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calculator calc1 = new Calculator(); //Creates a calculator object

        System.out.println("Simple Calculator - Add Two Numbers");
        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        int result = calc1.add(a,b); //Creates a result object which stores result from add method *
        System.out.println("Result of + operation: " + result);

        result = calc1.sub(a,b); //Reuses result object to store result from sub method *
        System.out.println("Result of - operation: " + result);

        result = calc1.mul(a,b); //Reuses result object to store result from sub method *
        System.out.println("Result of x operation: " + result);

        scan.close();
    }




}
