import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*first name */
		System.out.println("Enter your First Name : ");
		String fName = sc.nextLine();
		System.out.println(validfName(fName));
	}
/*last name */
		System.out.println("Enter your Last Name : ");
		String lName = sc.nextLine();
		System.out.println(validlName(lName));
/*email */
		System.out.println("Enter your Email : ");
		String email = sc.nextLine();
		System.out.println(validlName(email));
/*phone number */
		System.out.println("Enter your Phone Number : ");
		String number = sc.nextLine();
		System.out.println(validlName(number));
/*password */
		System.out.println("Enter your Password : ");
		String pw = sc.nextLine();
		System.out.println(validlName(pw));


}
	/* methods */
	public static boolean validfName(String fname) {
		String fnameRegex = "[A-Z]{1}[A-Za-z]{2,}";
		Pattern p = Pattern.compile(fnameRegex);
		Matcher m = p.matcher(fname);
		return m.matches();
	}
	public static boolean validlName(String lname) {
		String lnameRegex = "[A-Z]{1}[A-Za-z]{2,}";
		Pattern p = Pattern.compile(lnameRegex);
		Matcher m = p.matcher(lname);
		return m.matches();
	}
public static boolean validEmail(String email) {
		String emailRegex = "[a-zA-Z\\.]+[@][a-z]+[\\.][a-z\\.]{2,3}";
		Pattern p = Pattern.compile(emailRegex);
		Matcher m = p.matcher(email);
		return m.matches();
	}
public static boolean validNumber(String number) {
		String numRegex = "[0-9]{2}[ ][1-9]{1}[0-9]{9}";
		Pattern p = Pattern.compile(numRegex);
		Matcher m = p.matcher(number);
		return m.matches();
	}
public static boolean validPassWord(String pw) {
		String pwRegex = "^(?=.*[A-Z]).{8,}$";
		Pattern p = Pattern.compile(pwRegex);
		Matcher m = p.matcher(pw);
		return m.matches();
	}

}
