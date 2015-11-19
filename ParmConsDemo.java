// Параметризированный конструктор.
class MyClass { 

	int x;

	//У этого конструктора имеется параметр.
	MyClass(int i) { 
		x = i;//в конструкторе класса MyClass определяется единственный параметр i
	}
}

class ParmConsDemo {
	public static void main(String args[]) {
		MyClass tl = new MyClass(10);// значение 10 сначала передается параметру i конструктора, а затем присваивается переменной х
		MyClass t2 = new MyClass(88);
		System.out.println(tl.x + " " + t2.x);
	}
}
