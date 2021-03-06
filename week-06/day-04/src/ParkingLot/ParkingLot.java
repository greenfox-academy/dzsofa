package ParkingLot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    ArrayList<Car> parkingLot;
    int nrOfCars;

    public ParkingLot(int nrOfCars) {
        parkingLot = new ArrayList<>();
        this.nrOfCars = nrOfCars;
    }

    private void add() {
        this.parkingLot.add(new Car());
    }

    public void addCars() {
        for (int i = 0; i < this.nrOfCars; i++) {
            add();
        }
    }

    public void getCars() {
        for (Car car : this.parkingLot) {
            System.out.println(car);
        }
    }

    //counts occurrence of car types
    public void countTypes() {
        Map<Car.Type, Integer> typeCount = new HashMap<>();
        for (int i = 0; i < this.parkingLot.size(); i++) {
            Car.Type carType = this.parkingLot.get(i).getType();
            if (typeCount.containsKey(carType)) {
                int count = typeCount.get(carType);
                typeCount.put(carType, ++count);
            } else {
                typeCount.put(carType, 1);
            }
        }
        for (Map.Entry entry : typeCount.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey().toString() + " cars in parking lot.");
        }
        System.out.println();
    }

    //counts occurrence of colors
    public void countColors() {
        Map<Car.Color, Integer> colorCount = new HashMap<>();
        for (int i = 0; i < this.parkingLot.size(); i++) {
            Car.Color carColor = this.parkingLot.get(i).getColor();
            if (colorCount.containsKey(carColor)) {
                int count = colorCount.get(carColor);
                colorCount.put(carColor, ++count);
            } else {
                colorCount.put(carColor, 1);
            }
        }
        for (Map.Entry entry : colorCount.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey().toString().toLowerCase() + " cars in parking lot.");
        }
        System.out.println();
    }

    public void countAlike() {
        Map<String, Integer> carCount = new HashMap<>();
        for (int i = 0; i < this.parkingLot.size(); i++) {
            String car = this.parkingLot.get(i).toString();
            if (carCount.containsKey(car)) {
                int count = carCount.get(car);
                carCount.put(car, ++count);
            } else {
                carCount.put(car, 1);
            }
        }
//        for (Map.Entry entry : carCount.entrySet()) {
//            System.out.println(entry.getValue() + " " + entry.getKey().toString() + " cars in parking lot.");
//        }
//        System.out.println();
        Map.Entry<String, Integer> mostFrequent = null;
        for (Map.Entry<String, Integer> cars : carCount.entrySet()) {
            if (mostFrequent == null || cars.getValue() > mostFrequent.getValue()) {
                mostFrequent = cars;
            }
        }
        System.out.println("The most frequent car is: " + mostFrequent.getKey() + " with occurrence of: " + mostFrequent.getValue());
    }

    @Override
    public String toString() {
        return "There are " + this.parkingLot.size() + " cars in the parking lot.\n";
    }
}
