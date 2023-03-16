package dz_4;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> memory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду (add, print, revert):");

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.println("Введите строку:");
                String str = scanner.nextLine();
                memory.add(str);
            } else if (command.equals("print")) {
                for (int i = memory.size() - 1; i >= 0; i--) {
                    System.out.println(memory.get(i));
                }
            } else if (command.equals("revert")) {
                if (memory.size() > 0) {
                    memory.remove(memory.size() - 1);
                } else {
                    System.out.println("Память пуста!");
                }
            } else {
                System.out.println("Неправильная команда! Попробуйте еще раз.");
            }
        }
    }
}