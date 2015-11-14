// Применение оператора break для выхода из цикла, 
class BreakDemo {
	public static void main(String args[] )	{
	
		int num;
		
		num = 100;
		// выполнять цикл до тех пор, пока квадрат значения 
		// переменной i меньше значения переменной num 
		for(int i=0; i < num; i++)	{
			if(i*i >= num) 
			break; //прекратить цикл, если i*i >= 100 
			System.out.print(i + " ");
		}		
		System.out.println("Loop complete.");
	}
}
