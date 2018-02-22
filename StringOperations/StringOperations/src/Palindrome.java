
public class Palindrome {
	public static void main(String[] args) {
		
		String str ="MAMA";
		String reverseStr="";
		
		System.out.println(getReverse1(str));
		System.out.println(getReverse2(str));
		
		reverseStr	= getReverse1(str);
		reverseStr	= getReverse2(str);
		
		System.out.println("Reverse String "+reverseStr);
		if(str.equals(reverseStr))
		{
			System.out.println("String is Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}
	
	public static String getReverse1(String stringToReverse) {
		StringBuilder stringBuilder	= new StringBuilder(stringToReverse);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}
	
	public static String getReverse2(String stringToReverse) {
		String reverseStr	= "";
		for(int i=stringToReverse.length()-1;i>=0;i--)
		{
			reverseStr = reverseStr+stringToReverse.charAt(i);
		}
		return reverseStr;
	}
}
