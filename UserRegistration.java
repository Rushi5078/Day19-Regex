/**
 * 
 */
package com.RegexProblem;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author RUSHIKESH BHOSLE
 *
 */
public class UserRegistration 
{
	/**
	 * @purpose:Checking enter valid first name
	 * @return: no return value
	 */
	public static String firstName = "Rushikesh";
    public static void checkValidFirstUserName() 
	{
        boolean isFirstName;//check the validation
		String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(firstNameRegex);
		if (firstName == null)
		{
			isFirstName = false;
		}
		Matcher matcher = pattern.matcher(firstName);
		isFirstName = matcher.matches();
        //print the output
		 System.out.println(isFirstName);
    }
        public static void main(String[] args) 
	{
		//  Calling the method
		checkValidFirstUserName();
	}

}
