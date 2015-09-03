/*
Расчет числа кубических дюймов в кубе объемом в 1 милю.
*/
class Inches {
	public static void main(String args[])	{
		
		long ci; long im;//объявляем переменные типа long
		
		im = 5280 * 12;//вводим в переменную число дюйсов на одну сторону кубической мили
		
		ci = im * im * im;//получаем результат кубических дюймов
		
		System.out.println("There are " + ci +
		" cubic inches in cubic mile.");// выводим результат
	}
}
