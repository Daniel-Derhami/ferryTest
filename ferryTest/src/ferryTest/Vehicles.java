package ferryTest;

import java.util.Scanner;

public class Vehicles {

	private int MaxPassengers, Price, PassengersPrice, PassengersNumbers;

	private double FRCapacity;

	Scanner scan = new Scanner(System.in);

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getMaxPassenger() {
		return MaxPassengers;
	}

	public void setMaxPassenger(int maxPassenger) {
		MaxPassengers = maxPassenger;
	}

	public int getPassPrice() {
		return PassengersPrice;
	}

	public void setPassPrice(int passPrice) {
		PassengersPrice = passPrice;
	}

	public int getPassNumbers() {
		return PassengersNumbers;
	}

	public void setPassNumbers(int passNumbers) {
		PassengersNumbers = passNumbers;
	}

	public double getCapacity() {
		return FRCapacity;
	}

	public void setCapacity(double capacity) {
		FRCapacity = capacity;
	}
}