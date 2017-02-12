package ferryTest;

import java.util.Iterator;

public interface FerryAB {
	/* Count the number of passengers on the ferry */
	int countPassengers();
	
	/* Calculate the space of the vehicles based on their definition (Bicycle=1) */
	int countVehicleSpace();
	
	/* The money earned */
	int countMoney();
	
	/* Vehicle iterator. */
	Iterator<Vehicles> iterator();
	
	/* Embarking vehicles, Re-act when there is not enough space for more vehicle. */
	void embark(Vehicles ve);
	
	/* Embarking passengers, Re-act when there is not enough space for more passenger. */
	void embark(Passengers pas);
	
	/* Clear the ferry from vehicles and passengers */
	void disembark();
	
	/* True -- if it is possible to embark vehicle */
	boolean hasSpaceFor(Vehicles ve);
	
	/* True -- if it is possible to embark passenger  */
	boolean hasRoomForPassenger();
	
	/* Nice looking ferry status print out. */
	String toString();
}

