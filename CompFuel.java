/*
Добавление параметризированного метода, 
в котором производится расчет объема топлива, 
необходимого транспортному средству для преодоления заданного расстояния.
*/
class Vehicle {
	int passengers; // количество пассажиров
	int fuelcap; // емкость топливного бака
	int mpg;	// потребление топлива в милях на галлон }
	// возвратить дальность действия транспортного средства 
	
	int range()	{
		return mpg * fuelcap;
	} 
	
	// рассчитать объем топлива, необходимого транспортному 
	// средству для преодоления заданного расстояния 
	double fuelneeded(int miles) { 
		return (double) miles / mpg;
	}	
}

class CompFuel {
	public static void main(String args[]) {
	
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle(); 

		double gallons; 
		int dist = 252;
		
		// присвоить значения полям в объекте minivan 
		minivan.passengers = 7; 
		minivan.fuelcap = 16; 
		minivan.mpg = 21;
		
		// присвоить значения полям в объекте sportscar 
		sportscar.passengers = 2; 
		sportscar.fuelcap = 14; 
		sportscar.mpg = 12;
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
	}
}
