import java.util.Scanner;

import java.util.ArrayList;

public class Menu {

    Scanner read = new Scanner(System.in);
    // Vehicle vehicles[] = new Vehicle[10];
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    private int expectedVisitors = 30;

    public Menu() {
        Options();
    }

    public void Options() {
        System.out.println("Main Menu:");
        System.out.println("Insert 1 To Add New Vehicle");
        System.out.println("Insert 2 To View All Vehicles with Details");
        System.out.println("Insert 3 To View All Vehicles with Current Expected Visitor");

        Scanner read = new Scanner(System.in);

        String choice = read.nextLine();

        System.out.println(choice + " Inserted");

        Navigation(choice);
    }

    public void Navigation(String choice) {
        if (choice.equals("1")) {
            Add();
        } else if (choice.equals("2")) {
            DetailsInList();
        } else if (choice.equals("3")) {
            DetailsWithCount();
        }
    }

    public void AddType(int type) {
        System.out.println("Insert Model Number:");
        String modelNumber = read.nextLine();

        System.out.println("Insert Engine Power:");
        int enginePower = Integer.parseInt(read.nextLine());

        System.out.println("Insert Tire Size:");
        int tireSize = Integer.parseInt(read.nextLine());

        if (type == 1) {
            System.out.println("Insert Engine Type:");
            System.out.println("Insert 1 for Oil");
            System.out.println("Insert 2 for Gas");
            System.out.println("Insert 3 for Diesel");
            int engineType = Integer.parseInt(read.nextLine());
            Vehicle v = new Vehicle(modelNumber, engineType, enginePower, tireSize);

            vehicles.add(v);
        } else if (type == 2) {
            int engineType = 1;
            System.out.println("Insert Turbo Option:");
            System.out.println("Insert 1 for Turbo Charged");
            System.out.println("Insert 2 for Not Turbo Charged");
            int turboChoice = Integer.parseInt(read.nextLine());
            boolean turbo;
            if (turboChoice == 1) {
                turbo = true;
            } else {
                turbo = false;
            }
            expectedVisitors += 20;
            Sports s = new Sports(modelNumber, engineType, enginePower, tireSize, turbo);

            vehicles.add(s);

        } else {
            int engineType = 3;
            System.out.println("Insert Weight:");
            int weight = Integer.parseInt(read.nextLine());

            Heavy h = new Heavy(modelNumber, engineType, enginePower, tireSize, weight);

            vehicles.add(h);
        }

        System.out.println("Added Successfully!");
        Options();

    }

    public void Add() {
        System.out.println("Insert 1 to Add Normal Vehicle");
        System.out.println("Insert 2 to Add Sports Vehicle");
        System.out.println("Insert 3 to Add Heavy Vehicle");

        String choice = read.nextLine();
        System.out.println(choice + "Inserted");

        if (choice.equals("1")) {
            AddType(1);
        } else if (choice.equals("2")) {
            AddType(2);
        } else {
            AddType(3);
        }
    }

    public void DetailsInList() {
        if (vehicles.size() == 0)
            System.out.println("Sorry! There is no vehicles in the showroom at the moement");
        else {
            System.out.println("All Vehicles:");
            System.out.println();

            for (int i = 0; i < vehicles.size(); i++) {
                if (vehicles.get(i) != null) {
                    vehicles.get(i).showDetails();
                    System.out.println();
                } else {
                    break;
                }
            }
        }

        Options();
    }

    public void DetailsWithCount() {
        if (vehicles.size() == 0)
            System.out.println("Sorry! There is no vehicles in the showroom at the moement");
        else {
            System.out.println("All Vehicles (Model Number Only):");
            System.out.println();

            for (int i = 0; i < vehicles.size(); i++) {
                if (vehicles.get(i) != null) {
                    vehicles.get(i).showModelOnly();
                    System.out.println();
                } else {
                    break;
                }
            }
        }
        System.out.println("Expected Number Of Visitor: " + expectedVisitors);
        Options();
    }
}