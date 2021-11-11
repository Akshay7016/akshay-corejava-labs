package lab6.q1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "Akshay");
		hm.put(2, "Prasad");
		hm.put(3, "Amey");
		hm.put(4, "Rohan");
		
//		List<String> l = App.getValues((HashMap<Integer, String>) hm);
//		l.forEach(System.out::println);
		App.getValues(hm);
//		System.out.println(App.getValues(hm));

		
	}
	
	public static void getValues(Map<Integer, String> hm){
		
		List<String> l1 = new ArrayList<>();
		for(int i=0;i<hm.size();i++) {
			l1.add(hm.get(i));
		}
		
//		List<String> l2 = l1.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(l1);
//		return l2;
	}
}
