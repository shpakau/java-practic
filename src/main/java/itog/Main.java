package itog;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // получение списка ноутбуков
        ArrayList<Laptop> laptops = createLaptopsList();
        // создаем сканнер из полученных данных
        Scanner scanner = new Scanner(System.in);

        // получение дданных от пользователя
        double maxPrice = getDoubleFromUserInput(scanner, "Введите максимальную цену ноутбука: ");
        String color = getStringFromUserInput(scanner, "Введите цвет ноутбука: ");
        int minRAM = getIntFromUserInput(scanner, "Введите минимальный объем оперативной памяти: ");

        // фильтрация списка
        ArrayList<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getPrice() <= maxPrice &&
                    laptop.getColor().equalsIgnoreCase(color) &&
                    laptop.getRamSize() >= minRAM) {
                filteredLaptops.add(laptop);
            }
        }

        // вывод отфильтрованных ноутбуков
        if (!filteredLaptops.isEmpty()) {
            for (Laptop laptop : filteredLaptops) {
                System.out.println(laptop.getBrand() + ", " + laptop.getModel() + ", " + laptop.getRamSize() + " ГБ RAM, " +
                        laptop.getScreenSize() + " дюймов, " + laptop.getColor() + ", " + laptop.getPrice() + " руб.");
            }
        } else {
            System.out.println("Ноутбуки не найдены.");
        }
    }
    // список, можно в отдельный файл отправить
    private static ArrayList<Laptop> createLaptopsList() {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("HP", "Pavilion 15", 8, 15.6, "черный", 56999.0));
        laptops.add(new Laptop("Lenovo", "IdeaPad L340", 16, 17.3, "синий", 84999.0));
        laptops.add(new Laptop("Acer", "Swift 3", 8, 14.0, "серебристый", 44999.0));
        laptops.add(new Laptop("Dell", "Inspiron 15", 12, 15.6, "белый", 62999.0));
        laptops.add(new Laptop("ASUS", "ZenBook UX425EA", 16, 14.0, "серебристый", 79999.0));
        laptops.add(new Laptop("Apple", "MacBook Pro 13", 8, 13.3, "серый", 107999.0));
        laptops.add(new Laptop("HP", "EliteBook 850 G8", 16, 15.6, "черный", 107999.0));
        laptops.add(new Laptop("Lenovo", "ThinkPad X1 Carbon Gen 9", 16, 14.0, "черный", 139999.0));
        laptops.add(new Laptop("Acer", "Aspire 5 A515-56G-53F6", 8, 15.6, "черный", 51990.0));
        laptops.add(new Laptop("Dell", "XPS 13 9310", 16, 13.4, "серебристый", 124999.0));
        laptops.add(new Laptop("ASUS", "VivoBook S14 M433IA", 8, 14.0, "белый", 47990.0));
        laptops.add(new Laptop("Apple", "MacBook Air M1", 8, 13.3, "золотой", 95990.0));
        laptops.add(new Laptop("HP", "Spectre x360 13", 16, 13.3, "черный", 109999.0));
        laptops.add(new Laptop("Lenovo", "IdeaPad 3 15ITL6", 8, 15.6, "серый", 39990.0));
        laptops.add(new Laptop("Acer", "Chromebook Spin 713", 8, 13.5, "серебристый", 59990.0));
        laptops.add(new Laptop("Dell", "Inspiron 13 5310", 8, 13.3, "серый", 54990.0));
        laptops.add(new Laptop("ASUS", "ROG Zephyrus G15 GA503QM", 16, 15.6, "черный", 159999.0));
        laptops.add(new Laptop("Apple", "MacBook Pro 16", 16, 16.0, "серый", 239999.0));
        laptops.add(new Laptop("HP", "Omen 15", 16, 15.6, "черный", 119999.0));
        laptops.add(new Laptop("Lenovo", "Legion 5 15ACH6H", 16, 15.6, "черный", 119999.0));
        laptops.add(new Laptop("Acer", "Predator Helios 300 PH315-53", 16, 15.6, "черный", 129999.0));
        laptops.add(new Laptop("Dell", "G5 15 5515", 16, 15.6, "черный", 87990.0));
        laptops.add(new Laptop("ASUS", "TUF Gaming F15 FX506LI-HN137T", 8, 15.6, "черный", 77999.0));
        laptops.add(new Laptop("Apple", "MacBook Air M1 Pro", 8,13.4, "серебристый", 124999.0));
        return laptops;
    }

    private static double getDoubleFromUserInput(Scanner scanner, String message) {
        double result = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(message);
                result = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа. Попробуйте еще раз.");
            }
        }
        return result;
    }

    private static int getIntFromUserInput(Scanner scanner, String message) {
        int result = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(message);
                result = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа. Попробуйте еще раз.");
            }
        }
        return result;
    }

    private static String getStringFromUserInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

}