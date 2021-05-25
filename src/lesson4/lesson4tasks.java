package lesson4;
import java.util.*;

public class lesson4tasks {

	public static void main(String[] args) {
		String string1="Hello";
		String string2="Hi";
		StringUtils.betterString(string1, string2, (s1,s2)->s1.length()>s2.length());
		StringUtils.betterString(string1, string2, (x,y)->true);
		
	}
	

}
