package dz_5;
import java.util.*;

public class q_2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        // Создаем Map, где ключ - имя, значение - количество повторений
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            Integer count = nameCounts.getOrDefault(name, 0);
            nameCounts.put(name, count + 1);
        }

        // Сортируем по убыванию количества повторений
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(nameCounts.entrySet());
        sortedEntries.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        // Выводим результаты
        if (sortedEntries.get(0).getValue() == 1) {
            System.out.println("Нет повторяющихся имен");
        } else {
            for (Map.Entry<String, Integer> entry : sortedEntries) {
                if (entry.getValue() == 1) {
                    break;
                }
                System.out.println(entry.getKey() + " повторяется " + entry.getValue() + " раз(а)");
            }
        }
    }
}
