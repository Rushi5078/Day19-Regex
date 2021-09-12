/**
 * 
 */
package RegexProblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
                
	    /**
	     * @author RUSHIKESH BHOSLE
	     *
	     */

public class PasswordValidation1
{
	/**
	 * @purpose:Checking enter valid password rules1 minimum 8 character
	 * @return: no return value
	 */
					
public static String password = "rushikesh";
public static void checkValidPassword() 
{
 boolean ispassword;//check the validation
 String passwordRegex = "^[a-z]{8,}$";
 Pattern pattern = Pattern.compile(passwordRegex);
 if (password == null)
 {
 ispassword = false;
 }
 Matcher matcher = pattern.matcher(password);
 ispassword = matcher.matches();
 //print the output
 System.out.println(ispassword);
 }
 public static void main(String[] args) 
 {
 //  Calling the method
 checkValidPassword();
 }
}
