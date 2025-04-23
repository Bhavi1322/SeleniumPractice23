package Assignment12thday;
import java.util.ArrayList;
import java.util.List;
public class SortedOrderValidation {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		System.out.println("Is the list in ascending order?"+isSortedAscending(list));
		System.out.println("Is the list in descending order?"+isSortedAscending(list));
	}
	//ascending order
	public static boolean isSortedAscending(List<Integer>list) {
		for(int i = 1; i<list.size(); i++) {
			if (list.get(i)<list.get(i-1)) {
				return false;
			}
		}
		return true;

	}
	//check descending
	public static boolean isSortedDescending(List<Integer>list) {
		for(int i=1; i < list.size(); i++){
			if (list.get(i) > list.get(i-1)) {
				return false;
			}
		}
		return true;
	}

}
