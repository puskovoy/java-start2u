// Простой пример применения параметра в методе.
class ChkNum {
	// вернуть логическое значение true,
	// если х содержит четное число
	// Здесь х — целочисленный параметр метода isEven(). 
	boolean isEven(int x) {
		if((x%2) == 0) return true; 
		else return false;
	}
}

class ParmDemo {
	public static void main(String args[]) {
		ChkNum e = new ChkNum();
		// В следующих строках кода передаются аргументы методу isEven(). 
		if(e.isEven(10)) System.out.println("10 is even.");
		if(e.isEven(9)) System.out.println("9 is even.");
		if(e.isEven(8)) System.out.println("8 is even.");
	}
}
