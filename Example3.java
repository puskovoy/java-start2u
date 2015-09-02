/* Эта программа демонстрирует отличия между типами int и double
Присвоить ее исходному файлу имя Example3.java
 */
class Example3{
	public static void main(String args []){
		int var; //объявить целочисленную переменную
		double x; //объявить переменную с плавающей точкой
		
		var = 10; //присвоить переменной var значение 10
		
		x = 10.0; //присвоить переменной x значение 10.0
		
		System.out.println("Original value of var; " + var);
		System.out.println("Original value of x: " + x);
		System.out.println(); //вывести пустую строку
		
		//а теперь разделить значение переменной на 4
		
		var = var / 4;
		x = x / 4;
		
		System.out.println("var division: " + var);
		System.out.println("x division: " + x);			
	}
}