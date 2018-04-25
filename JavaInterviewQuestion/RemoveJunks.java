package JavaInterviewQuestion;

public class RemoveJunks {

	public static void main(String[] args) {

		String s = "@!$^!*&(*(NNKN    (*(*))))3433099";

		// Regular Expression:[az,AZ,09]

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
