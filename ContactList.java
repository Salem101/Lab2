import java.io.*; 
import java.util.*; 

public class ContactList {

	public static void main(String[]args) throws IOException{
		FileReader file = new FileReader("C:\\Users\\rivka\\Documents\\ContactList.csv");
		BufferedReader br = new BufferedReader(file);
		
		ArrayList<String> name = new ArrayList<String>(); 
		ArrayList<String> phoneNumber = new ArrayList<String>(); 
		ArrayList<String> zipCode = new ArrayList<String>(); 
		String line; 
		
		while ((line = br.readLine()) != null) {	
			
			String []contact = line.split(","); 
			
			String nm = contact[0]; 
			name.add(nm); 
			
			String num = contact[1]; 
			phoneNumber.add(num); 
							
			String zip = contact[2]; 
			zipCode.add(zip); 
		}
		br.close(); 
    
		//Sort in alphabetical order
		
		//System.out.println("Before sorting alphabetically: " + name); 
		Collections.sort(name); 
		System.out.println("Sorted Alphabetically: " ); 
	    for(int i=0;i<name.size();i++) {
	        System.out.println(name.get(i));
	    }
	    for(int j=0;j<phoneNumber.size();j++) {
	        System.out.println(phoneNumber.get(j));
	    }
	    FileWriter fileWriter = new FileWriter("output.txt");
	    PrintWriter printWriter = new PrintWriter(fileWriter); 
	    
	    for(int i=0;i<name.size();i++) {
	        printWriter.println(name.get(i));
	    }
	    for(int j=0;j<phoneNumber.size();j++) {
	        printWriter.println(phoneNumber.get(j));
	    }
	    printWriter.close(); 
	    
	}
	
}
