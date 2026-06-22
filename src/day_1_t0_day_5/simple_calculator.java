package day_1_t0_day_5;
import java.util.*;

public class simple_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter operator (+, -, *, /): ");
	        char operator = sc.next().charAt(0);
	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();
	        int result = 0;
	        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Division = " + result);
                break;
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();

	}

}
