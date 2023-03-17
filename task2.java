import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> roster = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова",
                "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));
        TreeMap<Integer, ArrayList<String>> listFrequency = new TreeMap<>();
        ArrayList<String> findName = new ArrayList<>();
        for (String item: roster) {
            String[] arr = item.split(" ");
            findName.add(arr[0]);
        }
        Set<String> arr = new LinkedHashSet<>(findName);
        for (String item: arr) {
            int count = Collections.frequency(findName, item);
            if (listFrequency.containsKey(count)) {
                ArrayList<String> name = listFrequency.get(count);
                name.add(item);
            } else {
                ArrayList<String> name = new ArrayList<>();
                name.add(item);
                listFrequency.put(count, name);
            }
        }
        for (HashMap.Entry entry: listFrequency.descendingMap().entrySet()) {
            System.out.println(entry);
        }
    }
}

