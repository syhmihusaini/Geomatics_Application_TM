import java.util.Scanner;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	
    public static void main(String[] args) {
    	System.out.println("Welcome to TM Geomatics Application.");
    	
    	// Get input from user
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Please enter your address:");
    	String address = scanner.nextLine().replaceAll(",", ", ");
        //Pass the address to AddressServices
        AddressComponets tokenizedAddress = AddressServices.inputAddress(address.replace(",  ", ", "));
        //end
        
        //error handling
        boolean errorhandle = AddressServices.invalidAddress(tokenizedAddress);
        if(errorhandle) {
        	System.out.println("Invalid Address. Please try again!");
        	//end
        }else {
        	//convert result to json format
            ObjectMapper mapper = new ObjectMapper();
            mapper.setSerializationInclusion(Include.NON_NULL);
        	try {
                String result = mapper.writeValueAsString(tokenizedAddress);
                System.out.println(result);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        	//end
        }
        
    }
}

