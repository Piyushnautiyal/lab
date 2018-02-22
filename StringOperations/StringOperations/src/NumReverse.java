import java.util.ArrayList;

public class NumReverse {

	public static void main(String[] args) {
		int a =123;
      ArrayList< Integer> al=new ArrayList<Integer>();
		int i;
		while(a>0)
		{
			i=a%10;
			System.out.println("i val "+i);
			a=a/10;
			System.out.println("a val "+a);
			al.add(i);
		}
		int nunber=0;
		for (Integer integer : al) {
		
			nunber=nunber*10+integer;
			
		}	
		System.out.println(nunber);
		
	}
	
}