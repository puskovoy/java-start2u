// Поиск в массиве с использованием разновидности for-each цикла for. 
class Search {
	public static void main(String args[]) { 

		int nums [ ] = { 6, 8, 3, 7, 5, 6, 1, 4 }; 
		int val = 5; 
		boolean found = false;
		// использовать разновидность for-each цикла for 
		// для поиска значения переменной val в массиве nums 
		for(int x : nums) { 
			if (x == val) { 
				found = true; break;
			}
		}
		if(found) System.out.println("Value found!");
	}
}