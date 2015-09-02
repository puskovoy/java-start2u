/* Продемонстрировать применение оператора if.
Присвоить исходному файлу имя IfDemo.java. */

public class IfDemo2 {
	public static void main(String args[])	{
		
		int c; //объявляем переменные и присваиваем значение
		
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		
		if(a < b) System.out.println("a menshe b");
		if(a <= b) System.out.println("a menshe ili ravno b");
		if(a > b) System.out.println("a bolshe b");
		if(a >= b) System.out.println("a bolshe ili ravno b");
		if(a == b) System.out.println("you won't see this  no a ravno b");// эта строка не должна выводиться 
		if(a != b) System.out.println("a neravno b");
		
		System.out.println();
		
		c = a - b; // переменная с получит значение -1
		
		System.out.println("c menshe 0");
		
		if(c >= 0) System.out.println("c is non-negative");
		if(c < 0) System.out.println("c is negative");
		
		System.out.println();
		
		c = b - a; // переменная с теперь получит значение 1
		System.out.println("c bolshe 0");
		
		if(c >= 0) System.out.println("c is non-negative");
		if(c < 0) System.out.println("c is negative");
	}
}