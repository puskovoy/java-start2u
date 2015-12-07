/* Методы с разными сигнатурами не переопределяются, а перегружаются. */ 
class A { 
	int i, j;
	A(int a, int b) { 
		i = a; 
		j = b;
	}
	// отобразить переменные i и j 
	void show() {
		System.out.println("i and j: " + i + " " + j); 
	}
}
// создать подкласс путем расширения класса A 
class B extends A { 
	int k;
	B(int a, int b, int с) { 
		super (a, b); 
		k = с;
	}
	// Сигнатуры данного метода и метода show() из класса A отличаются,
	// поэтому вместо переопределения происходит перегрузка метода.
	void show(String msg) {
		System.out.println(msg + k);
	}
}
class Overload2 {
	public static void main(String args[])	{
		B subOb = new B(1, 2, 3);
		subOb.show("This is k: "); // вызывается метод show() из класса В 
		subOb.show(); // вызывается метод show() из класса A
	}
}
