public class Car extends roadVehicle {
    private String bodyStyle;

    public Car(String brand, String model, int year, String color, int automobilePower, String bodyStyle) {
        super(brand, model, year, color, automobilePower);
        this.bodyStyle = bodyStyle;
    }

    public void getCarInfo() {
        getVehicleInfo();
        System.out.print(", Кузов: " + this.bodyStyle);
    }
}
