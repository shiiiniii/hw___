//1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
//что 1 человек может иметь несколько телефонов.


//
import java.util.HashMap;
import java.util.Map;

public class Phones{
	private Map<String, String> map = new HashMap<>();
	void add(String number, String name) {
		map.put(number, name);
	}
		void print(String name) {
			for(Map.Entry entry: map.entrySet()) {
				if(entry.getValue().equals(name)) {
					System.out.println(entry);
				}
			}
		}
}
