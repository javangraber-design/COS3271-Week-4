//Programmer: Javan Graber
//Date: 9/21/26

package javanproject;

import java.util.Scanner;
public class MyProject {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
    	//Create the variables
    	int feeling;
    	double age;
    	
    	//Print the options
    	System.out.println("Here is a list of the options for your current day:\n");
    	System.out.println("\t1: I'm having a really bad day and am feeling extremely sad.");
    	System.out.println("\t2: I'm not having a good day and I feel sad.");
    	System.out.println("\t3: I'm pretty average today. I'm not great, but not terrible either.");
    	System.out.println("\t4: I'm happy today and feel great!");
    	System.out.println("\t5: I feel extremely happy today, and I can't wait to see what the day will bring!");
    	System.out.println("\n");
        
        //Get the user input
    	System.out.print("How are you doing today? (Enter a number) --> ");
    	feeling = userinput.nextInt();
    	userinput.nextLine();
    	
        System.out.print("How old are you? (Enter as a number) --> ");
        age = userinput.nextDouble();
        userinput.nextLine();
        
        //Analyze the feelings and respond
        System.out.print("\n");
        if (feeling == 1) {
        	//Analyze the age for the correct response
        	if (age <= 6) {System.out.println("Make sure to pray to Jesus about it. He will help you be happy.");}
        	else if (age <= 13) {System.out.println("Have you talked to God about your feelings? Praying almost always helps.");}
        	else {System.out.println("I'm so sorry that you upset! I recommend praying to God about it and asking Him for peace.");}	
        }
        
        else if (feeling == 2) {
        	//Analyze the age for the correct response
        	if (age <=6) {System.out.println("I'm sorry that you're sad. Talk to God about it.");}
        	else if (age <= 13) {System.out.println("I'm sorry that you're upset. Make sure to tell God about any of your struggles.");}
        	else {System.out.println("I'm sorry that you are not feeling great today. You should pray to God about it and try to focus on the things you are thankful for.");}
        }
        		
        else if (feeling == 3) {
        	//Analyze the age for the correct response
        	if (age <=6) {System.out.println("You should find something fun to play or someone fun to play with!");}
        	else if (age <= 13) {System.out.println("You should try to find something fun to do or pause to think about some happy things that you could do later or even now!");}
        	else {System.out.println("It seems like you're ready to find something to be happy about. Think about the ways your life has been blessed.");}
        }
        		
        else if (feeling == 4) {
        	//Analyze the age for the correct response
        	if (age <=6) {System.out.println("I'm so happy that you're happy! I hope your day stays great!");}
        	else if (age <= 13) {System.out.println("I'm feeling happy just knowing that you're happy! Try to keep this happiness all day long and share it with those around you!");}
        	else {System.out.println("I'm happy to hear that you're happy! You should try to share this happiness with others too!");}
        }
        

        else if (feeling == 5) {
        	//Analyze the age for the correct response
        	if (age <=6) {System.out.println("I'm so excited that you're happy! God loves a positive attitude!");}
        	else if (age <= 13) {System.out.println("I'm so glad today has been so great for you! God sure has blessed you!");}
        	else {System.out.println("I am so excited to hear that your day has been great! It sure seems like God has blessed you! Don't ever forget about the joy He brings!");}
        }
        
        else {System.out.println("Sorry, make sure your responses are valid.");}   
        

    }

}
