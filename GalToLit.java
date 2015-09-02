/*
Пример для опробования 1.1
Эта программа преобразует галлоны в литры.
Присвоить ее исходному файлу имя GalToLit.java.
*/
class GalToLit {
	public static void main(String args[]) {
		
		double gallons; // в этой переменной хранится объем жидкости в галлонах  
		double liters; // в этой переменной хранится объем жидкости в литрах
		
		gallons = 10;	// исходное значение равно 10 галлонам
		
		liters = gallons * 3.7854; // преобразовать в литры
		
		System.out.println(gallons + " gallons is " + liters + " liters.");
		
	}
}
