// Демонстрация автоматического преобразования типа long в тип double, 
class LtoD {
	public static void main(String args[])	{
		long L;
		double D;

		L = 100123285L;

		// Автоматическое преобразование типа long в тип double.
		D = L;
		System.out.println("L and D: " + L + " " + D) ;
	}
}
		/*Тип double не может быть автоматически преобразован в тип long, 
		поскольку такое преобразование уже не является расширяющим. 
		Следовательно, приведенный ниже вариант той же самом программы оказывается некорректным.

		// *** Эта программа не подлежит компиляции. *** 
		class LtoD {
			public static void main(String args[]) { 
				long L:
				double D;

				D = 100123285.0;

				// Тип double не преобразуется автоматически в тип long.
				L = D; // Ошибка!!!
				System.out.println("L and D: " + L + " " + D) ;
			}
		}
Автоматическое преобразование числовых типов в тип char или boolean не производится. 
Кроме того, типы char и boolean несовместимы друг с другом. 
Тем не менее переменной char может быть присвоено значение, представленное целочисленным литералом.*/
