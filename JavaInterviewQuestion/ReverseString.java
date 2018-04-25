package JavaInterviewQuestion;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Selenium";

		// 1.using for loop //String class is immutable object and could not use reverse method
		int len = s.length();
		String rev = "";
		
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		//*****************************************************************************************************************
		
		// 2.using StringBuffer class //by using StringBuffer class, we can use reverse
		// method to reverse the String
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());

	}

}
