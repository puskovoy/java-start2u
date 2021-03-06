// Обращение к объекту подкласса по ссылке на объект суперкласса, 
class X { 
	int a;
	X(int i) { a = i; }
}
class Y extends X { 
	int b;
	Y(int i, int j) { 
		super(j); 
		b = i;
	}
}
class SupSubRef {
	public static void main(String args[]) {
		X x = new X(10);
		X x2;
		Y у = new Y(5, 6) ;
		
		x2 = x; // Допустимо, так как обе переменные одного типа.
		System.out.println("x2.a: " + x2.a);
		// Класс Y является подклассом X, поэтому переменные x2 и у	'
		// могут ссылаться на один и тот же объект производного класса.
		x2 = у; // По-прежнему допустимо по указанной выше причине.
		System.out.println("x2.a: " + x2.a);
		// В классе X известны только члены класса X. 
		x2.a = 19; // Допустимо.
		System.out.println("x2.a: " + x2.a);
		// x2.b = 27; // Ошибка, так как переменная Ь не является членом класса X.
	}
}
