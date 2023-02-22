class roadVehicle extends Transport {
    // Private field
    private int carPower;

    public roadVehicle(String brand, String model, int year, String color, int automobilePower) {
        super(brand, model, year, color);
        this.carPower = automobilePower;
    }

    public void getVehicleInfo() {  //details of car
        getInfo();
        System.out.print( " Мощность в л.с.: " + this.carPower);
    }


}

