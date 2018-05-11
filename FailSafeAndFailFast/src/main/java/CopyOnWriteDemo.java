import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> list	= new CopyOnWriteArrayList<String>();

		list.add("Element2");
		list.add("Element3");
		list.add("Element4");

		Iterator<String> listIterator	= list.iterator();
		
		list.add("Element1");
		
		while(listIterator.hasNext()) {
			System.out.println("Value from list is ["+listIterator.next()+"]");
			list.add("Element5");
			list.remove("Element3");
		}

	}

}
