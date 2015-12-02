// Применение статической переменной, 
class StaticDemo {
	
	int x; // обычная переменная экземпляра
	static int y; 
	// статическая переменная — это одна копия,
	// совместно используемая всеми объектами.
	// возвратить сумму значений переменной экземпляра x и
	// статической переменной у.
	
	int sum () {
		return x + y;
	}
}
class SDemo {
	public static void main(String args[]) {
		
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();
		
		// У каждого объекта имеется своя копия переменной экземпляра, 
		ob1.x = 10; 
		ob2.x = 20;
		
		System.out.println("Of course, ob1.x and ob2.x " + "are independent.");
		System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
		
		// Все объекты совместно пользуются одной общей 
		// копией статической переменной.
		System.out.println("\nThe static variable y is shared.");
		StaticDemo.y = 19;
		System.out.println("Set StaticDemo.y to 19.");
		System.out.println ("ob1.sum () : " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		
		StaticDemo.y = 100;
		System.out.println("\nChange StaticDemo.y to 100");
		System.out.println ("ob1. sum () : " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println(); 
	}
}
