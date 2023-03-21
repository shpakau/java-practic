package itog;
public class Laptop {
    private String brand;           // Марка
    private String model;           // Модель
    private int ramSize;            // Размер ОП в Гб
    private double screenSize;      // Размер экрана в дюймах
    private String color;           // Цвет
    private double price;           // Цена

    // классы
    public Laptop(String brand, String model, int ramSize, double screenSize, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.screenSize = screenSize;
        this.color = color;
        this.price = price;
    }

    // Геттеры и сеттеры для класса
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
