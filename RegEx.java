import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name : ");
		String fName = sc.nextLine();
		System.out.println(validfName(fName));
	}

	public static boolean validfName(String fname) {
		String fnameRegex = "[A-Z]{1}[A-Za-z]{2,}";
		Pattern p = Pattern.compile(fnameRegex);
		Matcher m = p.matcher(fname);
		return m.matches();
	}
}
