// Открытый и закрытый доступ к членам класса, 
class MyClass {
	
	private int alpha; // закрытый доступ 
	public int beta; // открытый доступ
	
	int gamma; //тип доступа по умолчанию по существу, открытый
	/* Методы доступа к переменной alpha. 
	Члены класса могут обращаться к закрытым членам того же класса.
	*/
	void setAlpha(int a) { 
		alpha = a;
	}
	int getAlpha() { 
		return alpha;
	}
}
class AccessDemo {
	public static void main(String args[]) {
		
		MyClass ob = new MyClass();
		
		/* Доступ к переменной alpha возможен только с помощью 
		специально предназначенных для этой цели методов. */ 
		ob.setAlpha(-99);
		System.out.println("ob.alpha is " + ob.getAlpha());
		// Обратиться к переменной alpha так, как показано ниже, нельзя.
		// ob.alpha =10; // Ошибка! alpha - закрытая переменная!
		// Следующие обращения вполне допустимы, так как 
		// переменные beta и gamma являются открытыми, 
		ob.beta = 88; 
		System.out.println("ob.beta is " + ob.beta);
		ob.gamma = 99;
		System.out.println("ob.gamma is " + ob.gamma);
	}
}
