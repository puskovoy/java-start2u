// Расположение метки имеет большое значение, 
class Break6 {
	public static void main(String args[]) { 

		int x=0, y=0;

		// Здесь метка располагается перед оператором, 
stopl: for(x=0; x < 5; x++) {
			for(y =0; y < 5; y++)	{
				if(y == 2) break stopl;
				System.out.println("х and у: " + x + " " + y);
			}
		}
		System.out.println();
		// А здесь метка располагается непосредственно перед // открывающей фигурной скобкой.
		for(x=0; x < 5; x++) stop2: {
			for(y =0; y < 5; y++)	{
				if(y == 2) break stop2;
				System.out.println("x and y: " + x + " " + y);
			}
		}
	}
}
