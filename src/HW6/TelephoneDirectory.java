package HW6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneDirectory {
    private Map<String, List<String>> directory;

    public TelephoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String surname, String phone) {
        if (!directory.containsKey(surname)) {
            directory.put(surname, new ArrayList<>());
        }
        directory.get(surname).add(phone);
    }

    public List<String> get(String surname) {
        return directory.getOrDefault(surname, null);
    }

    public static void main(String[] args) {
        TelephoneDirectory directory = new TelephoneDirectory();

        directory.add("Иванов", "123456789");
        directory.add("Петров", "987654321");
        directory.add("Иванов", "555555555");
        directory.add("Иванов", "333222332");

        String[] surname = {"Иванов", "Петров", "Сидоров"};
        for (String s : surname) {
            List<String> number = directory.get(s);
            if (number != null) {
                System.out.println("Телефоны для " + s + ": " + String.join(", ", number));
            } else {
                System.out.println("Нет записей для " + s);
            }
        }
    }
}