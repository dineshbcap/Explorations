import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String ar[]) {
		Pattern p = Pattern.compile("[bdar]");
		String tt[] = p.split("aderrrr");
		System.out.println(tt.length);
		for(String temp : tt ){
			System.out.println(temp);
		}
	}
}
