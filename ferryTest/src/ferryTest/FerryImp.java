package ferryTest;


import java.util.ArrayList;
import java.util.Iterator;


public class FerryImp implements FerryAB {

	private int TotalVehicles = 0;
	private int TotalMoney = 0;
	private int TotalPassengers = 0;
	private ArrayList<Vehicles> Vehclelist = new ArrayList<Vehicles>();
	
	
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
		// TODO Auto-generated method stub
		
	}

	public void embark(Passengers pas) {
		// TODO Auto-generated method stub
		
	}

	public void disembark() {
		// TODO Auto-generated method stub
		
	}

	public boolean hasSpaceFor(Vehicles ve) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasRoomForPassenger() {
		// TODO Auto-generated method stub
		return false;
	}

}
