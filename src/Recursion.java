import java.util.ArrayList;
import java.util.List;

/**
 * Homework 2
 * @author Varit Assavavisidchai
 *
 */
public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
	 * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
	 * Objects are compared using their own equals method.
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List unique(List list) {
		List item = list.subList(1, list.size());
		if(list.size()==0) {
			return null;
		}
		if(list.size()==1) {
			return list;
		}
		if(list.get(0)==list.get(1)){
			item.remove(0);
			unique(list);
		}else {
			unique(item);
		}
		return list;
	}
	
	/**
	 * Print all item in list.
	 * @param list
	 */
	public static void printList(List list) {
		for (Object o : list) {
			System.out.print(o);
		}
	}
	
	/**
	 * Simple fibonacci
	 * @param n
	 * @return result
	 */
	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	/**
	 * New version for fibonacci
	 * @param n
	 * @return result
	 */
	public static int Fasterfibonacci(int n) {
		int[] num = new int[n + 1];
		return helper(n, num);
	}
	
	/**
	 * Use Memorization to help in fibonacci
	 * @param n
	 * @param num
	 * @return result
	 */
	public static int helper(int n, int[] num) {
		if (n == 0) {
			num[0] = 0;
			return num[0];
		}
		if (n == 1) {
			num[1] = 1;
			return num[1];
		}
		num[n] = helper(n - 1, num) + num[n - 2];
		return num[n];
	}
	
	/**
	 * Main method to check Answer
	 * @param args
	 */
	 public static void main(String[] args) {
		 List<String> list = new ArrayList<String>();
		 list.add("a");
		 list.add("b");
		 list.add("b");
		 list.add("b");
		 list.add("c");
		 list.add("b");
		 list.add("b");
		 list.add("c");
		 list.add("c");
		 System.out.println(unique(list));
//		 System.out.println(fibonacci(45));
//		 System.out.println(Fasterfibonacci(45));
//		 int[] num = new int[4];
//		 System.out.println(num[2]);
		 }
}
