import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	
    public static void main(String[] args) {
    	System.out.println("Welcome to Geomatics Application.");
    	
    	// Get input from user
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter the apt no (Starts with “No “ e.g No 11):");
    	String aptNo = scanner.nextLine();
    	
    	System.out.println("Enter the section (The main of location e.g kg baru):");
    	String section = scanner.nextLine();
    	
    	System.out.println("Enter the street (The specific location e.g jalan mawar):");
    	String street = scanner.nextLine();
    	
    	System.out.println("Enter the postcode (Numbers from range of 01000-98859 e.g 50000):");
    	String postcode = scanner.nextLine();
    	
    	System.out.println("Enter the city (e.g Damansara, Kuala Lumpur etc ):");
    	String city = scanner.nextLine();
    	
    	System.out.println("Enter the state (e.g Selangor, Kelantan etc):");
    	String state = scanner.nextLine();
    	//end
    	
    	//Handle the comma pattern for address string
        String address = aptNo + ", " + section + ", " + street + ", " + postcode + " " + city +", "+state;
        String msgAddress = address.replace(", , ", ", ").replace(",  ", ", ");
        String finalAddress = "";
        
        if(msgAddress.endsWith(", ")) {
            finalAddress = msgAddress.substring(0, msgAddress.length()-2);
        }else {
        	finalAddress = msgAddress;
        }
       //end
        
        //Pass the address to AddressServices
        AddressComponets tokenizedAddress = AddressServices.inputAddress(finalAddress);
        //end
        
        boolean errorhandle = AddressServices.invalidAddress(tokenizedAddress);
        if(errorhandle) {
        	//error handling
        	System.out.println("Invalid Address. Please try again!");
        	//end
        }else {
        	//convert result to json format
            ObjectMapper mapper = new ObjectMapper();
        	try {
                String json = mapper.writeValueAsString(tokenizedAddress);
                System.out.println(finalAddress);
                System.out.println(json);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        	//end
        }
        
    }
}


