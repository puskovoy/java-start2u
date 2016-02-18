// Наследование интерфейсов, 
interface A { 
	void meth1(); void meth2();
}
// interface B содержит методы meth1() и meth2(), а
// кроме того, в него добавляется метод meth3().
interface B extends A {	// interface B наследует интерфейс A.
	void meth3();
}
// Этот класс должен реализовать все методы,
// объявленные в интерфейсах A и B. 
class MyClass implements B { 
	public void meth1() {
		System.out.println("Implement meth1().");
	}
	public void meth2() {
		System.out.println("Implement meth2().");
	}
	public void meth3() {
		System.out.println("Implement meth3().");
	}
}
class IFExtend {
	public static void main(String arg[ ] )	{
		MyClass ob = new MyClass();
		ob.meth1(); 
		ob.meth2(); 
		ob.meth3() ;
	}
}
