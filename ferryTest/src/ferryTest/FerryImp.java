package ferryTest;


import java.util.ArrayList;
import java.util.Iterator;


public class FerryImp implements FerryAB {

	private int TotalVehicles = 0;
	private int TotalMoney = 0;
	private int TotalPassengers = 0;
	private final int VEHSPACE = 40, PASSSPACE = 200;
	private ArrayList<Vehicles> Vehclelist = new ArrayList<Vehicles>();
	private ArrayList<Integer> Passengerlist = new ArrayList<Integer>();
	Passengers pa = new Passengers();
	
	
	public int countPassengers() {
		return TotalPassengers;
	}

	public int countVehicleSpace() {
		return (int) TotalVehicles;
	}

	public int countMoney() {
		return TotalMoney;
	}

	public Iterator<Vehicles> iterator() {
		Vehclelist.iterator();
		return null;
	}

	public void embark(Vehicles ve) {
		int n = ve.getPassNumbers();
		if (n <= (PASSSPACE - TotalPassengers) && hasSpaceFor(ve)
				&& n <= ve.getMaxPassenger()) {
			for (int i = 1; i <= n; i++) {
				TotalPassengers++;
				TotalMoney += ve.getPassPrice();

			}
			TotalMoney += ve.getPrice();
			Vehclelist.add(ve);
			TotalVehicles += ve.getCapacity();
			System.out
					.print("*Welcome! Your Vehicel and the passengers Embarked succesfully");
		} else
			System.out
					.print("OOPS! : This can not be embarked by these conditions! Sorry. Chek your inputs and try again");

	}

	public void embark(Passengers pas) {
		if (hasRoomForPassenger()) {
			TotalMoney += pa.getPRICE();
			TotalPassengers += pa.getSPACE();
			System.out.println("**Passenger embarked ");
		} else
			System.out.println("WARNING : No room for more Passengers !!!");
	}

	public void disembark() {
		Vehclelist.clear();
		Passengerlist.clear();
		TotalPassengers = 0;
		TotalVehicles = 0;
		System.out.println("  Ferry Disembarked  ");
	}

	public boolean hasSpaceFor(Vehicles ve) {
		if (VEHSPACE - TotalVehicles > ve.getCapacity())
			return true;
		else
			return false;
	}

	public boolean hasRoomForPassenger() {
		if (PASSSPACE > TotalPassengers)
			return true;
		else
			return false;
	}

}
