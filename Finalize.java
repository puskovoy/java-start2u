/*
Пример для опробования 4.2.
Демонстрация "сборки мусора" и метода finalize().
*/
class FDemo { 
	int x;

	FDemo(int i) { 
		x = i;
	}

	// вызывается при утилизации объекта 
	protected void finalize () { 
 		System.out.println("Finalizing " + x);
 	}

	// формирует объект, который тотчас уничтожается 
	void generator(int i) {
		FDemo о = new FDemo(i);
	}
}

class Finalize {
	public static void main(String args[]) { 

		int count;
	
		FDemo ob = new FDemo(0);
	
		/* А теперь сформировать большое количество объектов.
		В какой-то момент должна начаться "сборка мусора".
		Примечание: количество формируемых объектов, возможно, 
		придется увеличить, чтобы принудить "сборку мусора". */ 
		for(count=1; count < 1000000; count++) ob.generator(count);
	}
}
