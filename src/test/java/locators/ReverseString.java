package locators;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String origin = "December February";
		String rev=" ";
		int originLength = origin.length();
		for(int i=originLength-1;i>=0;i--) {
			rev=rev+origin.charAt(i);
		}
		System.out.println(origin);
		System.out.println(rev);

	}

}
