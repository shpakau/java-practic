package dz_4;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public class q2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("раз");
        linkedList.add("два");
        linkedList.add("три");
        linkedList.add("четыре");

        System.out.println("Первоначальный список: " + linkedList);
        LinkedList<String> reversedList = reverseLinkedList(linkedList);
        System.out.println("Перевернутый список: " + reversedList);
    }

    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> linkedList) {
        LinkedList<T> reversedList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            reversedList.add(linkedList.get(i));
        }
        return reversedList;
    }
}