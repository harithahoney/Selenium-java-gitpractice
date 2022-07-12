package locators;

public class ProgramsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String s ="January February";
	 int vowelsCount=0;
	 int len=s.length();
	 for(int i=0;i<len-1;i++) {
		 char ch = s.charAt(i);
		 if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='0')||(ch=='u')||(ch=='A')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
		 {
			 System.out.println(ch+" ");
			 vowelsCount++;
		 }
	 }
	 System.out.println("Number of vowels in given string are: "+ vowelsCount);

	}

}
