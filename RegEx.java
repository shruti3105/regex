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
}
