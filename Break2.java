// Чтение вводимых данных до тех пор, пока не будет получена буква q. 
class Break2 {
	public static void main(String args[]) throws java.io.IOException { 

		char ch;
		
		// "Бесконечный" цикл, завершаемый с помощью оператора break. 
		for( ; ; )	{
			ch = (char) System.in.read(); // ввести символ с клавиатуры 
			if(ch == 'q') break;
		}
		System.out.println("You pressed q!");
	}
}
