//Повторное генерирование исключений, 
class Rethrow {
	public static void genException()	{
		// Массив numer длиннее массиве denom.
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
		for(int i=0; i<numer.length; i++)	{
			try {
				System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
			}
			catch (ArithmeticException exc) {
				// перехватить исключение
				System.out.println("Can't divide by Zero!");
			}
			catch (ArrayIndexOutOfBoundsException exc) { 
				// перехватить исключение
				System.out.println("No matching element found."); 
				throw exc; // Повторное генерирование исключения.
			}
		}
	}
}
class RethrowDemo {
	public static void main(String args[])	{
		try {
			Rethrow.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			// Перехват повторно сгенерированного включения.
			System.out.println("Fatal error - " +
			"program terminated.");
		}
	}
}
