public class Heavy extends Vehicle {
    private int weight;

    public Heavy(String modelNumber, int engineType, int enginePower, int tireSize, int weight) {
        super(modelNumber, engineType, enginePower, tireSize);

        System.out.println("Heavy Parameter");
        this.weight = weight;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Weight: " + weight + " kg");
    }
}