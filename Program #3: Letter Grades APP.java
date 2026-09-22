//Programmer: Javan Graber
//Date: 9/21/26

package javanproject;

import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) {
    	  //Get the test score and associate it with the needed ASCII value
        System.out.print("Enter a test score: ");
        int testscore = userinput.nextInt();
        int ascii = 74 - (testscore / 10);
        if (ascii > 68) {ascii = 70;}

        
        //Get the last value of the score
        int scoreDigit = testscore % 10;
        String gradeAdjustment;
        
        
        
        //Isolate the F and A because there is no F+ or A+ and print
        if (testscore < 60) {System.out.format("Grade = " + (char)ascii);}
        
        else if (testscore >= 100) {System.out.println("Grade = A");}
        
        else if (testscore >= 93) {System.out.format("Grade = " + (char)ascii);}
        
        //Associate others with + or - if needed and print
        else if (scoreDigit >= 7) {
        	gradeAdjustment = (char)ascii + "+";
        	System.out.format("Grade = " + gradeAdjustment);}
        
        else if (scoreDigit <= 2) {
        	gradeAdjustment = (char)ascii + "-";
        	System.out.format("Grade = " + gradeAdjustment);}
        
        else {System.out.println("Grade = " + (char)ascii);}
        
    }
}
