// Преобразование строчных букв английского алфавита в прописные поразрядным оператором, 
class UpCase {
	public static void main(String args[])	{
		
		char ch;
		
		for(int i=0; i < 10; i++)	{
			ch = (char) ('a' + i) ;
			System.out.print(ch);
			// В следующем операторе сбрасывается шестой бит.
			// После этого в переменной ch будет храниться код 
			// символа прописной буквы, 
			ch = (char) ((int) ch & 65503);//при выполнении данной операции 
			//все биты кода символа в переменой ch, 
			//за исключением шестого, остаются без изменения, 
			//а шестой бит сбрасывается в нуль
			System.out.print(ch + " ") ;
		}
	}
}