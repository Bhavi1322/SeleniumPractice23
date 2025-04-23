package Assignment12thday;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
//import java.util.*;
public class DuplicateElementCount {
	
	public static Map<Integer,Integer> getDuplicatecount(List<Integer>list){
		Map<Integer,Integer> countMap=new HashMap<>();
		for (Integer num : list) {
			countMap.put(num,  countMap.getOrDefault(num, 0)+ 1);
		}
		Map<Integer,Integer> duplicates = new HashMap<>();
		for(Map.Entry<Integer,Integer>entry: countMap.entrySet()) {
			if(entry.getValue() > 1) {
				duplicates.put(entry.getKey(),entry.getValue());
			}
		}
		return duplicates;
	}
		
	public static void main(String[] args) {
	     List<Integer>list = Arrays.asList(1,2,3,2,4,3,5);
	     Map<Integer,Integer>duplicateCount = getDuplicatecount(list);
	     System.out.println("Duplicate elements count:"+ duplicateCount);
	}

}
