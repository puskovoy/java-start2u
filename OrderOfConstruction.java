// Демонстрация порядка вызова конструкторов.
// создать суперкласс 
class A {
	A() {
		System.out.println("Constructing A.");
	}
}
// создать подкласс путем расширения класса A 
class B extends A {
	B() { 
		System.out.println("Constructing B.") ;
	}
}
// создать подкласс путем расширения класса B 
class C extends B {
	C() {
		System.out.println("Constructing C.") ;
	}
}
class OrderOfConstruction {
	public static void main(String args[])	{
		C z = new C();
	}
}
