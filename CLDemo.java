// Отображение всех данных, указываемых в командной строке, 
class CLDemo {
	public static void main(String args[]) {
		
		System.out.println("There are " + args.length +	" command-line arguments.");
		
		if (args.length != 0) {//если в коммандной строке введены параменры 
			System.out.println("They are: "); 
			for(int i=0; i<args.length; i++)
				System.out.println("arg[" + i + "]: " + args[i]);//параметры отображаются
		}
		else {
			System.out.println("There are no arg");
		}		
	}
}
