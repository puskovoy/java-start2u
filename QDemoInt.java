class Qyeue {
	int q[]; //Массив для хранения элементов очереди целочисленных значений
	int putloc, getloc; // размещения и извлечения элементов очереди

	Qyeue (int size) { //Конструктор
		q = new int[size+1]; // выделить память для очереди
		putloc = getloc = 0;
	}	

	//поместить число в очередь
	void put(int chislo) {
		if (putloc==q.length-1) {//проверяем не переполнена ли очередь
			System.out.println(" - Qyeue is full.");
			return;
		}
		putloc++;
		q[putloc]=chislo;
	}

	//извлечь число из очереди
	int get(){
		if (getloc==putloc) {//проверяем пуста ли очередь
			System.out.println(" - Qyeue is empty.");
			return (int) 0;
		}

		getloc++;
		return q[getloc];
	}
}

// продемонстрировать класс Qyeue 
class QDemoInt {
	public static void main(String args[])	{
		
		Qyeue bigQ = new Qyeue(100);
		Qyeue smallQ = new Qyeue (4); 
		int chislo; 
		int i;
		
		chislo = 0;
		System.out.println("Using bigQ to store the alphabet.");
		// поместить числовые значения в очередь bigQ 
		for(i=0; i < 26; i++) bigQ.put(chislo++);
		// извлечь числовые значения из очереди bigQ и отобразить 
		System.out.print("Contents of bigQ: "); 
		for(i=0; i < 26; i++)	{
			chislo = bigQ.get();
			if(chislo != 0) System.out.print(chislo);
		}
		System.out.println("\n");
		System.out.println("Using smallQ to generate errors.");
		
		// использовать небольшую очередь smallQ для генерации ошибок 
		for(i=0; i < 5; i++) {
			System.out.print("Attempting to store " + chislo--);
			smallQ.put(chislo--);
			System.out.println();
		}
		System.out.println();
		
		// дополнительные ошибки при обращении к очереди smallQ 
		System.out.print("Contents of smallQ: "); 
		for(i=0; i < 5; i++) { 
			chislo = smallQ.get();
			if(chislo != 0) System.out.print(chislo);
		}
	}
}
