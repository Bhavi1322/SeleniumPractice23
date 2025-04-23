package Assignment12thday;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ListToSet {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Set<Integer> set = new HashSet<>(list);

	   System.out.println("Set: " +set);
	}

}
