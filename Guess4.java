class Guess4 {
	public static void main(String args[]) throws java.io.IOException {
		
		char ch, ignore, answer = 'S';
		
		do {
			System.out.println("I'm thinking of a letter between A and Z."); 
			System.out.print("Can you guess it: ");
			// ввести символ с клавиатуры 
			ch = (char) System.in.read();
			// отвергнуть все остальные символы во входном буфере 
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
		
			if(ch == answer) System.out.println("** Right **"); 
			else {
				System.out.print("...Sorry, you're ");
				if(ch < answer) System.out.println("too low");
				else System.out.println("too high");
				System.out.println("Try again!\n");
				}
		} while(answer != ch) ;
	}
}
