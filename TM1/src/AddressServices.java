import java.util.regex.Matcher;
import java.util.regex.Pattern;


public abstract class AddressServices extends ErrorHandling{
	
	public static AddressComponets inputAddress(String address) {
		AddressComponets result = new AddressComponets();
		
		String p1 = "\\s(\\d+),\\s(.+?),\\s(.+?),\\s(\\d+)\\s(.+?),\\s(.+?)$";
		Pattern pt1 = Pattern.compile(p1);
		Matcher mc1 = pt1.matcher(address);
		
		String p2 = "\\s(\\d+),\\s(.+?),\\s(\\d+)\\s(.+?),\\s(.+?)$";
		Pattern pt2 = Pattern.compile(p2);
		Matcher mc2 = pt2.matcher(address);
		
		String p3 = "\\s(\\d+),\\s(.+?),\\s(\\d+)\\s(.+?)$";
		Pattern pt3 = Pattern.compile(p3);
		Matcher mc3 = pt3.matcher(address);

		String p4 = "\\s(\\d+),\\s(.+?),\\s(.+?)$";
		Pattern pt4 = Pattern.compile(p4);
		Matcher mc4 = pt4.matcher(address);
		
		
		
		if (mc1.find()) {
			result.setApt("No "+mc1.group(1));
			result.setSection(mc1.group(2));
			result.setStreet(mc1.group(3));
			result.setPostCode(mc1.group(4));
			result.setCity(mc1.group(5));
			result.setState(mc1.group(6));
		} else if (mc2.find()) {
			result.setApt("No "+mc2.group(1).trim());
			result.setSection(mc2.group(2).trim());
			result.setPostCode(mc2.group(3).trim());
			result.setCity(mc2.group(4).trim());
			result.setState(mc2.group(5).trim());
		} else if (mc3.find()) {
			result.setApt("No "+mc3.group(1).trim());
			result.setSection(mc3.group(2).trim());
			result.setPostCode(mc3.group(3).trim());
			result.setCity(mc3.group(4).trim());
		} else if(mc4.find()) {
			result.setApt("No "+mc4.group(1).trim());
			result.setSection(mc4.group(2).trim());
			result.setCity(mc4.group(3).trim());
		}
		
		
		return result;
	}
	

}
