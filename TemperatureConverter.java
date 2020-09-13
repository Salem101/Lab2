import java.util.Scanner;

public class TemperatureConverter {

	public static void main (String[]args) {
		//using scanner to get user input
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("What is the temperature in Farenheit?");
		//get input as double type
		double fr = keyboard.nextDouble();
		
		//calculation from F to C
		double ce = (fr-32)*5/9;
		
		//output the answer with 2 decimal places
		System.out.println(fr + " degrees in Fareneheit equals " + String.format("%.2f", ce) + " degrees in Celsius.");		
		
	}
}
