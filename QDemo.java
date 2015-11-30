class Qyeue {

	private char q[]; //Массив для хранения элементов очереди
	private int putloc, getloc; // размещения и извлечения элементов очереди

	Qyeue (int size) {
		q = new char[size+1]; // выделить память для очереди
		putloc = getloc = 0;
	}	

	//поместить символ в очередь
	void put(char ch) {
		if (putloc==q.length-1) {//проверяем не переполнена ли очередь
			System.out.println(" - Qyeue is full.");
			return;
		}
		putloc++;
		q[putloc]=ch;
	}

	//извлечь символ из очереди
	char get(){
		if (getloc==putloc) {//проверяем пуста ли очередь
			System.out.println(" - Qyeue is empty.");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}

// продемонстрировать класс Qyeue 
class QDemo {
	public static void main(String args[])	{
		
		Qyeue bigQ = new Qyeue(100);
		Qyeue smallQ = new Qyeue (4); 
		char ch; 
		int i;
		
		System.out.println("Using bigQ to store the alphabet.");
		// поместить буквенные символы в очередь bigQ 
		for(i=0; i < 26; i++) 
			bigQ.put((char) ('A' + i));
		// извлечь буквенные символы из очереди bigQ и отобразить 
		System.out.print("Contents of bigQ: "); 
		for(i=0; i < 26; i++)	{
			ch = bigQ.get();
			if(ch != (char) 0) 
				System.out.print(ch + " ");
		}
		System.out.println("\n");
		System.out.println("Using smallQ to generate errors.");
		
		// использовать небольшую очередь smallQ для генерации ошибок 
		for(i=0; i < 5; i++) {
			System.out.print("Attempting to store " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();
		
		// дополнительные ошибки при обращении к очереди smallQ 
		System.out.print("Contents of smallQ: "); 
		for(i=0; i < 5; i++) { 
			ch = smallQ.get();
			if(ch != (char) 0) 
				System.out.print(ch);
		}
	}
}
