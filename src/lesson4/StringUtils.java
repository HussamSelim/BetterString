package lesson4;

public class StringUtils {
	public static void betterString(String a, String b, isBetterInterface<String> i ) {
		if (i.isBetter(a, b)){
			System.out.println("A is better than b");
		}
		else {
			System.out.println("B is better than a");
		}
		
		}
}
