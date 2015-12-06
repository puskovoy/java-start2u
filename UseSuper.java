// Применение ключевого слова super для предотвращения сокрытия имен, 
class A { int i;}
// создать подкласс, расширяющий класс A. 
class B extends A {
	int i; // Эта переменная i скрывает переменную i из класса A.
	B(int a, int b) {
	// Оператор super.i ссылается на переменную i иэ класса A.
		super.i = a; // переменная i из класса A 
		i = b;	// переменная i из класса B
	}
	void show()	{		
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i) ;
	}
}
class UseSuper {
	public static void main(String args[]) {
		B subOb = new B(1, 2);
		subOb.show();
	}
}
