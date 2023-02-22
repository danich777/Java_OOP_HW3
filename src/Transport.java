public abstract class Transport {
    // Private Fields
    private String brand;
    private String model;
    private int year;
    private String color;

        // Parameterized Constructor
    public Transport(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // public method to print details
    public void getInfo() {
        System.out.print("Производитель: " + brand + "," + " Модель: " + model+ ","
                + " Год: " + year + "," + " Цвет: " + color+ ",");
        }




}
