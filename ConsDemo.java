// Простой конструктор.
class MyClass { 
	
	int x;
	
	// Конструктор класса MyClass.
	MyClass() {
		x = 10;
	}
}

class ConsDemo {
	public static void main(String args[]) {
		MyClass tl = new MyClass();
		MyClass t2 = new MyClass();
		System.out.println(tl.x + " " + t2.x);
	}
}
