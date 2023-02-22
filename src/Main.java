
/*Создать иерархию родительский и дочерний классы для Транспорта
        Например Транспорт - > Автомобиль - > Автобус
        Транспорт - > Автомобиль - > Легковой
        Используем наследование, инкапсуляцию*/
public class Main {
    public static void main(String[] args) {
        roadVehicle KIARio = new roadVehicle("KIA", "RIO", 2011, "красный", 120);
        KIARio.getVehicleInfo();
        Car BMWx5 = new Car("BMW", "X5", 2011, "красный", 240, "Седан");
        System.out.println();
        BMWx5.getCarInfo();
    }
}