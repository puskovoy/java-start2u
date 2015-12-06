// Добавление конструктора в класс Triangle.
// Класс, описывающий двумерные объекты, 
class TwoDShape {
	private double width; // Теперь эти переменные 
	private double height; // объявлены как закрытые.
	// Методы доступа к переменным экземпляра width и height.
	double getWidth() { 
		return width; 
	}
	double getHeight() { 
		return height; 
	}
	void setWidth(double w) { 
		width = w; 
	}
	void setHeight(double h) { 
		height = h; 
	}
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}
// Подкласс, производный от класса TwoDShape,
// для представления треугольников, 
class Triangle extends TwoDShape { 
	private String style;
	// Конструктор.
	Triangle(String s, double w, double h) {
		// Создание родительской части объекта,
		// соответствующей классу TwoDShape. 
		setWidth(w); 
		setHeight(h);
		style = s;
	}
	double area() {
		return getWidth() * getHeight() / 2;
	}
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
class Shapes3 {
	public static void main(String args[]) {
		Triangle tl = new Triangle("isosceles", 4.0, 4.0);
		Triangle t2 = new Triangle("right", 8.0, 12.0);
		
		System.out.println("Info for tl: "); 
		tl.showStyle(); 
		tl.showDim();
		System.out.println ("Area is " + tl.area());
		System.out.println();
		
		System.out.println("Info for t2: "); 
		t2.showStyle(); 
		t2.showDim();
		System.out.println("Area is " + t2.area());
	}
}
