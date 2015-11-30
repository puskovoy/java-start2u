// Методам можно передавать объекты, 
class Block { 
	
	int a, b, c; 
	int volume;

	Block (int i, int j, int k) { 
		a = i; 
		b = j; 
		c = k;
		volume = a * b * c;
	}
	// возвратить логическое значение true, если 
	// параметр ob определяет такой же параллелепипед 
	//В качестве параметра методу передается объект.
	boolean sameBlock(Block ob) {
		if((ob.a == a) & (ob.b == b) & (ob.c == c)) 
			return true; 
		else 
			return false;
	}
	// возвратить логическое значение true, если
	// параметр ob определяет параллелепипед такого же объема
	//В качестве параметра методу передается объект.
	boolean sameVolume(Block ob) {
		if(ob.volume == volume) 
			return true; 
		else 
			return false;
	}
}
class PassOb {
	public static void main(String args[]) {
		
		Block obi = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(4, 5, 5);
		// Здесь методам передаются объекты.
		System.out.println("obi same dimensions as ob2: " + obi.sameBlock(ob2)) ;
		System.out.println("obi same dimensions as ob3: " + obi.sameBlock(ob3));
		System.out.println("obi same volume as ob3: " + obi.sameVolume(ob3) ) ;
	}
}
