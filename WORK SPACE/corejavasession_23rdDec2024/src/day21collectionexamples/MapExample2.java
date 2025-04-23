package day21collectionexamples;
import java.util.HashMap;
import java.util.Map;
public class MapExample2 {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("key1", "admin");//up casting
		m1.put("key2", "admin");//up casting
		m1.put(null, "admin123");//up casting
		System.out.println("Map element are:"+m1);
		System.out.println("Map element count:"+m1.size());
		Map m2=new HashMap();
		m2.put("A1", 123);
		m2.put("A2", 456);
		m2.put("A3", 789);
		m2.put("key2", "calling");
		System.out.println("Map element are:"+m2);
		System.out.println("Map element count:"+m2.size());
		
		m1.putAll(m2);
		System.out.println("Map element are:"+m1);
		System.out.println("Map element count:"+m1.size());
		
	}

}
