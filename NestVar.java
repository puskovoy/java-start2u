/*
В этой программе предпринимается попытка объявить переменную во внутренней области действия с таким же именем, как и у переменной, определенной во внешней области действия.
*** Эта программа не подлежит компиляции. ***
*/
class NestVar {
	public static void main(String args[]) {
		
		int count; // Первое объявление переменной count
		for(count = 0; count < 10; count = count+1) {
			System.out.println("This is count: " + count);
			int count; // Второе объявление переменной count.
			// Недопустимо, поскольку точно такая же 
			// переменная объявлена раньше!!!
			for(count = 0; count < 2; count++)
			System.out.println("This program is in error!");
		}
	}
}
