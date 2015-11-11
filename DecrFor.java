// Цикл for, выполняющийся с отрицательным приращением переменной, 
class DecrFor {
	public static void main(String args[])	{
	
		int x;
		// На каждом шаге цикла управляющая им переменная уменьшается на 5.
		for(x = 100; x > -100; x -= 5)
		System.out.println(x) ;
	}
}
