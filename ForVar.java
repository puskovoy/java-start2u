// Объявление переменной управления циклом в самом цикле for. 
class ForVar {
	public static void main(String args[]) { 

		int sum = 0; 
		int fact = 1;

		// Вычисление факториала чисел от 1 до 5.
		// Переменная управления объявляется в этом цикле for.
		for(int i = 1; i <= 5; i++) {
			sum += i; // Она доступна во всем цикле, 
			fact *= i;
		}
		
		//Но недоступна за пределами цикла.
		System.out.println("Sum is " + sum);
		System.out.println("Factorial is " + fact);
	}
}
