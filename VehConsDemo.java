// Добавление конструктора.
class Vehicle {
	
	int passengers; // количество пассажиров
	int fuelcap; // емкость топливного бака
	int mpg;	// потребление топлива в милях на галлон
	
	// Это конструктор класса Vehicle.
	Vehicle(int p, int f, int m) { 
		passengers = p; 
		fuelcap = f; 
		mpg = m;
	}

	// возвратить дальность действия транспортного средства 
	int range() {
		return mpg * fuelcap;
	}
	// рассчитать объем топлива, необходимого транспортному 
	// средству для преодоления заданного расстояния  
	double fuelneeded(int miles) { 
		return (double) miles / mpg;
	}
}

class VehConsDemo {
	public static void main(String args[])	{
		// сконструировать полностью объекты транспортных средств 
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12); 

		double gallons; 
		int dist = 252;
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
	}
}
