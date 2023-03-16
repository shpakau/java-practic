package dz_3;

import java.util.ArrayList;
import java.util.Iterator;

public class q3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("животные");
        list.add("4");
        list.add("зубр");
        list.add("кабан");
        list.add("кролик");
        list.add("12");
        list.add("1");

        System.out.println("Первоначальный список: " + list);

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            try{
                Integer.parseInt(element);
                iterator.remove();
            } catch (NumberFormatException e){

            }
        }

        System.out.println("Итоговый список: " + list);

    }
}