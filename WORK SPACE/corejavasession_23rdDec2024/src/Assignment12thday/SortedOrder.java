package Assignment12thday;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class SortedOrder {
	public static String CheckSorteOrder(List<Integer>inputList) {
		 List<Integer>ascendingList = new ArrayList<>(inputList);
		 List<Integer>descendingList = new ArrayList<>(inputList);
		 Collections.sort(ascendingList);
		 Collections.sort(descendingList,Collections.reverseOrder());
		 
		 
		  if (inputList.equals(ascendingList)) { 
			  return "Ascending";
		  }else if (inputList.equals(descendingList)) {
			    return "Descending";
			  
		  }else {
			  return "Not sorted";
		  }
	}
	public static void main(String[] args) {
		List<Integer> inputList1 = Arrays.asList(1,2,3,4,5);
		List<Integer> inputList2 = Arrays.asList(5,4,3,2,1);
		List<Integer> inputList3 = Arrays.asList(3,1,2,4,5);
		
		System.out.println("List 1 is in: "+inputList1);
	    System.out.println("List 1 is in: "+inputList2);
	    System.out.println("List 1 is in: "+inputList3);
}
}
