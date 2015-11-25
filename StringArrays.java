//массив символьных строк, 
class StringArrays {
	public static void main(String args[]) {
		
		// Массив символьных строк.
		String strs[] = { "This", "is", "a", "test." };
		
		System.out.println("Original array: "); 
		for(String s : strs) 
			System.out.print(s + " ");
		System.out.println("\n") ;

		// изменить символьную строку 
		strs[1] = "was"; 
		strs[3] = "test, too!";
		
		System.out.println("Modified array: "); 
		for(String s : strs)
			System.out.print (s + " ");
	}
}
