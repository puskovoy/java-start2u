/*
Пример для опробования 1.2
Эта программа отображает таблицу преобразования галлоны в литры. Присвоить ее исходному файлу имя GalToLitTable.java.
*/
class GalToLitTable {
	public static void main(String args[]){
		
	double gallons, liters; 
	int counter;
	
	// Первоначально в счетчике строк устанавливается нулевое значение.
	counter = 0;
	
	for(gallons = 1; gallons <= 100; gallons++){
		liters = gallons * 3.7854;  // преобразовать в литры 
		System.out.println(gallons + " gallons is " + liters + " liters.");																		
		counter++; // увеличение счетчика строк происходит на каждом шаге цикла,
		if (counter == 10){
			System.out.println() ; // а через каждые десять строк выводится пустая строка.
			counter = 0; // сбросить счетчик строк
			}
		}
	}
}
