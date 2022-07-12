package Programs;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to java";
		String[] words = str.split(" ");
		String reverseString = " ";
		/*
		 * for(String w: words)
		 *  { 
		 *  String reverseWord = " ";
		 *  for(int i=w.length()-1;i>=0;i--)
		 *   {
		 *    reverseWord+=w.charAt(i);
		 *    }
		 * reverseString=reverseString+reverseWord+" ";
		 *  }
		 */

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString += str.charAt(i);
		}
		System.out.println(reverseString);// emocleW ot avaj
	}

}
