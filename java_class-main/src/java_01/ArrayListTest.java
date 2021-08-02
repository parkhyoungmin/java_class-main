package java_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		listObject();
		listGeneric();
		listMethods();
		listSort();
		list2Array();
	}
	
	private static void listObject() {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list); // Arrays.toString(배열);
	}
	
	private static void listGeneric() {
		List<String> glist = new ArrayList<>();
		glist.add("A");
		glist.add("B");
//		glist.add(1); X
		System.out.println(glist.get(1));
		System.out.println(glist.size());
	}
	
	private static void listMethods() {
		List<Integer> nums1 = Arrays.asList(1,2,-1);
		List<Integer> nums2 = Arrays.asList(4,5,6);
		List<Integer> allNums = new ArrayList<Integer>();
		allNums.addAll(nums1);
		allNums.addAll(nums2);
		System.out.println(allNums); // [1, 2, -1, 4, 5, 6]
		allNums.forEach(s -> System.out.println("[" + s + "]"));
		/*
		[1]
		[2]
		[-1]
		[4]
		[5]
		[6]
		 */
		for (Integer i : allNums) {
			System.out.println("[" + i + "]");
		}
	}
	
	private static void listSort() {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("strawberry");
		list.add("orange");
		Collections.sort(list); // 내림차순정렬 [apple, orange, strawberry]
		Collections.reverse(list); // 오름차순정렬 [strawberry, orange, apple]
	}
	
	private static void list2Array() {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("strawberry");
		list.add("orange");
		String[] array = list.toArray(new String[list.size()]); // 
		System.out.println(Arrays.toString(array));
		List<String> list1 = Arrays.asList(array);
		System.out.println(list1);
		List<String> list2 = Arrays.asList("apple", "orange");
	}
	
}






