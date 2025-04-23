package day21collectionexamples;
import java.util.HashMap;
import java.util.Map;
public class MapExample {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("key1", "admin");//up casting
		m1.put("key2", "admin");//up casting
		m1.put(null, "admin123");//up casting
		System.out.println("Map element are:\n"+m1);
		System.out.println("Map element count:\n"+m1.size());
		m1.put("key2", "manager");
		m1.put(458, "manager");
		m1.put(null, 1234);// boxing dn up casting
		System.out.println("Map element are:\n"+m1);
		System.out.println("Map element count:\n"+m1.size());
		System.out.println("Map element are:\n"+m1);
		System.out.println("Get the key value:\n"+m1.get("key2"));
		System.out.println("key set of map:\n"+m1.keySet());
		System.out.println("values of map:\n"+m1.values());
		
	}

}
