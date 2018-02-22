import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Palindrome {
	public static void main(String[] args) {
		
		String str ="MAMA";
		String reverseStr="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverseStr = reverseStr+str.charAt(i);
		}
		
		System.out.println("Reverse String "+reverseStr);
		if(str.equals(reverseStr))
		{
			System.out.println("String is Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}

}
