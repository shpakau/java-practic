package dz_3;

import java.util.ArrayList;
import java.util.Collections;

public class q2 {

    public static void main(String[] args) {

        // Создание списка
        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        // Добавление элементов
        numbersList.add(16);
        numbersList.add(9);
        numbersList.add(99);
        numbersList.add(3);
        numbersList.add(28);

        // Нахождение минимального значения
        int minValue = Collections.min(numbersList);
        System.out.println("Минимальное значение: " + minValue);

        // Нахождение максимального значения
        int maxValue = Collections.max(numbersList);
        System.out.println("Максимальное значение: " + maxValue);

        // Нахождение среднего арифметического
        double sum = 0;
        for (int number : numbersList) {
            sum += number;
        }
        double averageValue = sum / numbersList.size();
        System.out.println("Среднее арифметическое: " + averageValue);
    }
}