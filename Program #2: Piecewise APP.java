//Programmer: Javan Graber
//Date: 9/21/26

package javanproject;

import java.util.Scanner;
public class MyProject {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
    	//Create the variable
    	double number;
    	
    	//Ask the user for input
    	System.out.print("Enter the number that will be represented as x --> ");
    	number = userinput.nextDouble();
    	userinput.nextLine();
    	
    	//Print the result
    	if (number < 0) {System.out.format("\t3x + 7 = %.2f\n", 3 * number + 7);}
    	else if (number <= 10) {System.out.format("\tx^2 + 8 = %.2f\n", Math.pow(number, 2) + 8);}
    	else if (number > 10) {System.out.format("\tx^3 - 6x^2 = %.2f\n", (Math.pow(number, 3)) - (6 * (Math.pow(number, 2))));}
  
    }

}
