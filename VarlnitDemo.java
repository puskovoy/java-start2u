// Демонстрация срока действия переменной, 
class VarlnitDemo {
	public static void main(String args[]) { 

		int x;
		
		for(x = 0; x < 3; x++)	{
			int у = -1; // переменная у инициализируется при каждом входе в блок 
			System.out.println("y is: " + у); // всегда выводится значение -1 

			у = 100;
			System.out.println("y is now: " + у);
		}
	}
}

// на каждом шаге цикла for переменная у инициализируется значением -1. 
// Затем ей присваивается значение 100, но по завершении кодового блока данного цикла оно теряется