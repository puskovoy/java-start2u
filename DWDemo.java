// Демонстрация цикла do-while, 
class DWDemo {
	public static void main(String args[]) throws java.io.IOException {
		
		char ch;
		
		do {
			System.out.print("Press a key followed by ENTER: "); 
			ch = (char) System.in.read(); 
			// ввести символ с клавиатуры q для остановки
		} while(ch != 'q');
	}
}
