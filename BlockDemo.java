/*
Продемонстрировать применение кодового блока.
Присвоить исходному файлу имя BlockDemo.java.
*/
class BlockDemo {
	public static void main(String args[]) {
		double i, j, d;

		i = 5; j = 10;
		// Адресатом этого оператора if является целый кодовый блок.
		if(i != 0) {
			System.out.println("i does not equal zero"); d = j / i;
			System.out.print("j / i is " + d);
		}
	}
}
