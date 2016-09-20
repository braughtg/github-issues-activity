/**
 * This class contains some dumb methods for use with Strings.
 * Hence the name.
 * @author chris
 *
 */
public class DumbString {

	/**
	 * @param s String to check
	 * @return true if all chars in s are digits ('0'-'9') and false otherwise
	 */
	public boolean allDigits(String s) {
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c) == false)
				return false;
		}
		return true;
	}
	
	/**
	 * Determines the number of letters that the two parameters have in common
	 * @param a
	 * @param b
	 * @return the number of letters the two Strings have in common; -1 if either is null
	 */
	public static int lettersInCommon(String a, String b) {
		int common = 0;
		for (char c : a.toCharArray()) {
			if (b.indexOf(c) != -1) {
				common++;
			}
		}
		return common;
	}
	
}
