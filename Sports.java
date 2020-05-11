public class Sports extends Vehicle {
    private Boolean turbo;

    public Sports(String modelNumber, int engineType, int enginePower, int tireSize, Boolean turbo) {
        super(modelNumber, engineType, enginePower, tireSize);

        System.out.println("Sports Parameter");
        this.turbo = turbo;
    }

    public String TurboMap(Boolean turbo) {
        if (turbo == true)
            return "Turbo Charged";
        else
            return "Not Turbo Charged";
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Turbo: " + TurboMap(turbo));
    }

}