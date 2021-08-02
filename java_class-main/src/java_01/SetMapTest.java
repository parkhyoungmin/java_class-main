package java_01;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetMapTest {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("A"); // 중복 허용하지 않아서 생략됨
		System.out.println(hashSet); // [A, B]
		
		hashSet = new HashSet<>();
		hashSet.add("A");
		hashSet.add("C");
		hashSet.add("E");
		hashSet.add("D");
		hashSet.add("B");
		System.out.println(hashSet); // [A, B, C, D, E]
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("A");
		linkedHashSet.add("C");
		linkedHashSet.add("E");
		linkedHashSet.add("D");
		linkedHashSet.add("B");
		System.out.println(linkedHashSet); // [A, C, E, D, B]
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("E");
		treeSet.add("D");
		treeSet.add("B");
		System.out.println(treeSet); // [A, B, C, D, E]
		
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("JavaScript");
		set.add("CSS");
		set.add("HTML");
		set.removeIf(s -> s.startsWith("J"));
		System.out.println(set); // [CSS, HTML]
		
		mapTest();
	}
	
	private static void mapTest() {
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("A", "1");
		hashMap.put("E", "5");
		hashMap.put("C", "3");
		System.out.println(hashMap); // {A=1, C=3, E=5}
		
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("A", "1");
		linkedHashMap.put("E", "5");
		linkedHashMap.put("C", "3");
		System.out.println(linkedHashMap); // {A=1, E=5, C=3}
		
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("A", "1");
		treeMap.put("E", "5");
		treeMap.put("C", "3");
		System.out.println(treeMap); // {A=1, C=3, E=5}
		
		hashMap.clear(); // hashMap 내용 모두 삭제
		hashMap.put("A", "5");
		System.out.println(hashMap); // {A=5}
		hashMap.put("A", "1");
		System.out.println(hashMap); // {A=1} A라는 키가 있기때문에 덮어쓰게됨
		hashMap.putIfAbsent("A", "2"); // A라는 키가 없다면 2를 넣어라
		System.out.println(hashMap); // {A=1} A라는 키가 있기때문
		hashMap.putIfAbsent("B", "2");
		System.out.println(hashMap); // {A=1, B=2}
		System.out.println(hashMap.get("A")); // 1
		Collection<String> collection = hashMap.values(); // 모든 값을 반환해달라
		for (String val : collection) {
			System.out.println(val); // 1 2
		}
		Set<String> keyset = hashMap.keySet();
		System.out.println(keyset); // [A, B]
		Set<Map.Entry<String, String>> set = hashMap.entrySet(); // 각 키와 value의 쌍을 가져온다
		System.out.println(set); // [A=1, B=2]
		for (Map.Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		hashMap.forEach((key, value) -> System.out.println(key + ":" + value));
		
		System.out.println(hashMap.containsKey("A")); // true
		System.out.println(hashMap.containsKey("1")); // false
		System.out.println(hashMap.containsValue("A")); // false
		System.out.println(hashMap.containsValue("1")); // true
	}
	
}






