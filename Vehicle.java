public class Vehicle {
    private String modelNumber;
    private int engineType;// 1: oil, 2:gas. 3:diesel
    private int enginePower;
    private int tireSize;

    public Vehicle() {
    }

    public Vehicle(String modelNumber, int engineType, int enginePower, int tireSize) {
        System.out.println("Vehicle Parameter");
        this.modelNumber = modelNumber;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.tireSize = tireSize;
    }

    public String EngineTypeMap(int type) {
        if (type == 1)
            return "Oil";
        else if (type == 2)
            return "Gas";
        else
            return "Diesel";
    }

    public void showDetails() {
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Engine Type: " + EngineTypeMap(engineType));
        System.out.println("Engine Power : " + enginePower + " cc");
        System.out.println("Tire Size: " + tireSize);
    }

    public void showModelOnly() {
        System.out.println(modelNumber);
    }

    public String GetVehicleType() {
        return "Normal";
    }
}