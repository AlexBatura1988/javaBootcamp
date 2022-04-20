package javabootcamp.basic.string;

public class Runner {
	public static void main(String[] args) {
		String s = "Good morning Sunshine Moshe Gjj";
		System.out.print(getUniqeLeeters(s));

	}

	public static String getUniqeLeeters(String str) {
		String nStr = "";
		String onlyFirstLetters = getFirstLetters(str);

		for (int i = 0; i < onlyFirstLetters.length(); i++) {
			if (nStr.indexOf(Character.toLowerCase(onlyFirstLetters.charAt(i))) < 0
					&& nStr.indexOf(Character.toUpperCase(onlyFirstLetters.charAt(i))) < 0) {
				nStr += onlyFirstLetters.charAt(i);
			}

		}

		return nStr;
	}

	private static String getFirstLetters(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				sb.append(str.charAt(i + 1));
			}

		}

		return sb.toString();
	}

}
