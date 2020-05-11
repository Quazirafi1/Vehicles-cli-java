import java.util.Scanner;

public class Menu {

    Scanner read = new Scanner(System.in);
    Vehicle vehicles[] = new Vehicle[10];

    public Menu() {
        Options();
    }

    public void Options() {
        System.out.println("Main Menu:");
        System.out.println("Insert 1 To Add New Vehicle");
        System.out.println("Insert 2 To View All Vehicles");

        Scanner read = new Scanner(System.in);

        String choice = read.nextLine();

        System.out.println(choice + "Inserted");

        Navigation(choice);
    }

    public void Navigation(String choice) {
        if (choice.equals("1")) {
            Add();
        } else if (choice.equals("2")) {
            DetailsInList();
        }
    }

    public void Add() {
        System.out.println("Insert Model Number:");
        String modelNumber = read.nextLine();

        System.out.println("Insert Engine Type:");
        System.out.println("Insert 1 for Oil");
        System.out.println("Insert 2 for Gas");
        System.out.println("Insert 3 for Diesel");
        int engineType = Integer.parseInt(read.nextLine());

        System.out.println("Insert Engine Power:");
        int enginePower = Integer.parseInt(read.nextLine());

        System.out.println("Insert Tire Size:");
        int tireSize = Integer.parseInt(read.nextLine());

        Vehicle v = new Vehicle(modelNumber, engineType, enginePower, tireSize);

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                continue;
            } else {
                vehicles[i] = v;
                break;
            }
        }

        Options();
    }

    public void DetailsInList() {
        System.out.println("All Vehicles:");
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                vehicles[i].showDetails();
            } else {
                break;
            }
        }

        Options();
    }
}