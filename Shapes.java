// Простая иерархия классов.
// Класс, описывающий двумерные объекты, 
class TwoDShape { 
	double width; 
	double height;
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}
// Подкласс класса TwoDShape для представления треугольников.
// Класс Triangle наследует от класса TwoDShape 
class Triangle extends TwoDShape {
	String style;
	double area() {
		//C класса Triangle можно обращаться к членам класса 
		// TwoDShape таким же образом, как и к собственным членам.
		return width * height / 2;
	}
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
class Shapes {
	public static void main(String args[]){
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		// Все члены класса Triangle, даже унаследованные от класса
		// TwoDShape, доступны из объектов типа Triangle.
		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "isosceles";
		
		t2.width = 8.0; 
		t2.height = 12.0; 
		t2.style = "right";
		
		System.out.println("Info for tl: "); 
		t1.showStyle(); 
		t1.showDim();
		System.out.println("Area is " + t1.area());
		System.out.println();
		
		System.out.println("Info for t2: "); 
		t2.showStyle(); 
		t2.showDim();
		System.out.println("Area is " + t2.area());
	}
}
