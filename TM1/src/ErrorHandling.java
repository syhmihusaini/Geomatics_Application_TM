
public abstract class ErrorHandling {

	public static boolean invalidAddress(AddressComponets tokenizedAddress) {
		boolean checkNull = false;
        
        if(tokenizedAddress.getApt() == null && tokenizedAddress.getSection() == null && tokenizedAddress.getCity() == null) {
        	checkNull = true;
        };
		return checkNull;
	}

}
