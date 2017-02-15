package ferryTest;

import java.util.Scanner;

public class FerryMain {
	public static void main(String[] args) {

		FerryImp TheFerry = new FerryImp();
		int num1, num2;
		System.out.println("*^*^*^*^* --> Welcome to Our lovely Ferry <-- *^*^*^*^*");
		Scanner sc = new Scanner(System.in);
		System.out.println("0=Exit   1=Embark Vehicle   2=Embark Passenger   3= DisEmbark   4=Statistics  ");
		while ((num1 = sc.nextInt()) != 0) {
			switch (num1) {
			case 1:System.out.println("1=Bicycle , 2=Car , 3=Bus , 4=Lorry  or ==> 0=Return ");
				while ((num2 = sc.nextInt()) != 0) {
					switch (num2) {
					case 1:
						Bicycles bike=new Bicycles();
						bike.setPassNumbers(1);
						TheFerry.embark(bike);
						break;
					case 2:
						Cars car=new Cars();
						System.out.println("Number of passenger(s) in the Car : ");
						car.setPassNumbers(sc.nextInt());
						TheFerry.embark(car);
						break;
					case 3:
						Busses bus=new Busses();
						System.out.println("Number of passenger(s) in the Bus : ");
						bus.setPassNumbers(sc.nextInt());
						TheFerry.embark(bus);
						break;
					case 4:
						Lorry lorry=new Lorry();
						System.out.println("Number of passenger(s) in the Lorry : ");
						lorry.setPassNumbers(sc.nextInt());
						TheFerry.embark(lorry);
						break;
					case 0:
						break;
						default :
							System.out.println();
							break;
	}
					System.out.println("\n"+"1=Bicycle , 2=Car , 3=Bus , 4=Lorry  or ==> 0=Return ");
		}
				break;

			case 2:
				Passengers passenger=new Passengers();
				TheFerry.embark(passenger);
				break;
			case 3:
				TheFerry.disembark();
				break;
			case 4:
				break;
			case 0:
				break;
				default :
					System.out.print("Wrong Input!, Try Again Please");
					break;
					
			}
			System.out.println("\n"+"0=Exit   1=Embark Vehicle   2=Embark Passenger   3= DisEmbark   4=Statistics  ");
			}
	}
	}

