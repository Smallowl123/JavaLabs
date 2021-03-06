package rpis81.alexandrov.oop.model.vehicle;

public enum VehicleTypes {

    NONE("none"),
    CAR("car"),
    CROSSOVER("crossover"),
    MOTORBIKE("motorbike"),
    SUV("suv"),
    TRUCK("truck"),
    OTHER("other");

    private String value;

    VehicleTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
