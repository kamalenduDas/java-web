
package project1Helper;


public class IsInteger {
    
    public static boolean isInteger(String s) {
		boolean isValidInteger = false;
		try
		{
		   Integer.parseInt(s);

		   // s is a valid integer

		   isValidInteger = true;
		}
		catch (NumberFormatException ex)
		{
		   // s is not an integer
		}

		return isValidInteger;
	}

}
