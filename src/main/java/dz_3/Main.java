package dz_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // Создаем список целых чисел
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(16);
        numbers.add(9);
        numbers.add(22);
        numbers.add(11);
        numbers.add(6);

        // Удаляем четные числа из списка
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        // Выводим получившийся список на экран
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}