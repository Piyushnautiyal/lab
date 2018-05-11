import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentTest {
public static void main(String[] args) {
	
	ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
	try
	{
		concurrentHashMap.put("1", "Manas");
		concurrentHashMap.put("2", "Piyush");
		concurrentHashMap.put("3", "Sonia");
		concurrentHashMap.put("4", "Suraj");
		
		Iterator<String> itr = concurrentHashMap.keySet().iterator();
		
		concurrentHashMap.put("0", "TP");
		
		while(itr.hasNext())
		{
			String  key = itr.next();
			concurrentHashMap.put("5","HUM");
			System.out.println("Key "+key+" Value "+concurrentHashMap.get(key)+" Size of map "+concurrentHashMap.size() );
			concurrentHashMap.remove("3");
		}
	}
	catch(Exception ee)
	{
		ee.printStackTrace();
	}
	
	
	
}
}
