import java.util.*;

public class TemperatureConverter {

	public static void main (String[]args) {
		//using scanner to get user input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("To convert from Farenheit to Celsius type F, to convert from Celsius to Farenheit type C"); 
		String ans = keyboard.nextLine(); 
		if (ans.equalsIgnoreCase("F")) {
			System.out.println("What is the temperature in Farenheit?");
			//get input as double type
			double fr = keyboard.nextDouble();
		
			//calculation from F to C
			double ce = (fr-32)*5/9;
		
			//output the answer with 2 decimal places
			System.out.println(fr + " degrees in Fareneheit equals " + String.format("%.2f", ce) + " degrees in Celsius.");		
			System.exit(0); 

		}
		if (ans.equalsIgnoreCase("C")) {
			
			System.out.println("What is the temperature in Celsius?");
			//get input as double type
			double ce = keyboard.nextDouble();
			
			//calculation from C to F
			double fr = ((ce*1.8) +32); 
					
			//output the answer with 2 decimal places
			System.out.println(ce + " degrees in Celsius equals " + String.format("%.2f", fr) + " degrees in Farenheit.");		
		}
		else {
			System.out.println("Invalid input");
		}
		keyboard.close(); 
	}
}
