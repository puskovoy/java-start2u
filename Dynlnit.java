// Демонстрация динамической инициализации, 
class Dynlnit {
	public static void main(String args[])	{
		double radius = 4, visota = 5;
		// Переменная volume инициализируется динамически 
		// во время выполнения программы.
		double obiem = 3.1416 * radius * radius * visota;
		System.out.println("Radius is " + radius + "\nVisota is " + visota + "\nObiem is " + obiem);
	}
}
