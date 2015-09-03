// С символьными переменными можно обращаться, как с целочисленными, 
class CharArithDemo {
	public static void main(String args[]) { 
		char ch;
		
		ch = 'X';
		System.out.println("ch contains " + ch) ;
		
		ch++; // переменную типа char можно инкрементировать
		System.out.println("ch is now " + ch) ;
		
		ch = 90; // переменной типа char можно присвоить целочисленное значение 90 = Z
		System.out.println("ch is now " + ch) ;
	}
}
