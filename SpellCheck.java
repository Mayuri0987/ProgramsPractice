
public class SpellCheck {
	static String removeSpaces(String str) {
		char[] ch = str.toCharArray();
		// convert the string into array
		String nstr = "";
		// create a new empty string
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ')
				nstr = nstr + ch[i];
			/*
			 * if the character at ith index is not equal to space then add that character
			 * to new empty string
			 */
		}
		return nstr;
	}

	static String toLowerCase(String str) {
		char[] ch = str.toCharArray();
		// convert the string into array
		String nstr = " ";
		// create a new empty string
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				nstr = nstr + ((char) ch[i] + 32);
			}
			/*
			 * if any alphabet is in upper case convert it into lower case
			 */
			else {
				nstr = nstr + ch[i];
				// if it is in lower case no need to convert
			}
		}
		return nstr;
	}

	static String sort(String str) {
		char[] ch = str.toCharArray();
		// sort string in alphabetical order
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char t = ch[i];
					ch[i] = ch[j];
					ch[j] = t;
				}
			}
		}
		String st = new String(ch);
		return st;
	}

	static int compare(String s1, String s2) {
		int count = 0;
		if (s1.length() != s2.length())
			return 0;
		else {
			s1 = toLowerCase(s1);
			s2 = toLowerCase(s2);
			s1 = sort(s1);
			s2 = sort(s2);
			System.out.println(s1);
		s1=s1.trim();
		s2=s2.trim();
			System.out.println(s1);
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
		
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] == ch2[i]) {
					count++;
					System.out.println(count);
					
				}
			}

			return count;

		}
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = sc.nextLine();
		System.out.println("Enter the second string");
		String s2 = sc.nextLine();
		s1 = removeSpaces(s1);
		s2 = removeSpaces(s2);
		int b = compare(s1, s2);
		System.out.println("count is:" + b);
	}

}
