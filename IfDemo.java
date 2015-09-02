/* Продемонстрировать применение оператора if.
Присвоить исходному файлу имя IfDemo.java. */

class IfDemo {
	public static void main(String args[])	{
		
		int a, b, c; a = 2; b = 3;//объявляем переменные и присваиваем значение
		
		if(a < b) System.out.println("a is less than b");// следующая строка не должна выводиться 
		if(a == b) System.out.println("you won't see this");
		
		System.out.println();
		
		c = a - b; // переменная с получит значение -1
		
		System.out.println("c contains -1");
		
		if(c >= 0) System.out.println("c is non-negative");
		if(c < 0) System.out.println("c is negative");
		
		System.out.println();
		
		c = b - a; // переменная с теперь получит значение 1
		System.out.println("c contains 1");
		
		if(c >= 0) System.out.println("c is non-negative");
		if(c < 0) System.out.println("c is negative");
	}
}
