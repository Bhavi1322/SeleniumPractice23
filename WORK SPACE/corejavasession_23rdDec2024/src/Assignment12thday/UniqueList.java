package Assignment12thday;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
public class UniqueList {
	
    public static List<String>getUniqueElements(List<String> list){
    	Set<String> set =new HashSet<>(list);
    	return new ArrayList<>(set);
    }
	public static void main(String[] args) {
	List<String>list=Arrays.asList("bhavi","sam","miru","shiv","saru","sam","saru");
	List<String>uniqueElements=getUniqueElements(list);
	System.out.println("Unique Elements:"+uniqueElements);
		

	}

}
