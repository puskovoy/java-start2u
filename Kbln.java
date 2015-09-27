// Чтение символа с клавиатуры, 
class Kbln {
	public static void main(String args[]) throws java.io.IOException {
		char ch;
		System.out.print("Press a key followed by ENTER: ");
		// Ввод символа с клавиатуры.
		ch = (char) System.in.read(); // получаем значение типа char 

		System.out.println("Your key is: " + ch);
	}
}
