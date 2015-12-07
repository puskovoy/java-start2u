class TwoDShape {
	private double width; 
	private double height;
	// Конструктор по умолчанию.
	TwoDShape()	{
		width = height = 0.0;
	}
	// Параметризированный конструктор.
	TwoDShape(double w, double h) { 
		width = w; 
		height = h;
	}
	// построить объект с одинаковыми значениями 
	// переменных экземпляра width и height 
	TwoDShape(double x) { 
		width = height = x;
	}
	// Построение одного объекта на основании другого объекта.
	TwoDShape(TwoDShape ob) { 
		width = ob.width; 
		height = ob.height;
	}
	// Методы доступа к переменным width и height, 
	double getWidth() { return width; } 
	double getHeight() { return height; } 
	void setWidth(double w) { width = w; } 
	void setHeight(double h) { height = h; }
	
	void showDim() {
		System.out.println("Width and height are " +
			width + " and " + height);
	}
}
// Подкласс класса TwoDShape для треугольников, 
class Triangle extends TwoDShape { 
	private String style;
	// Конструктор по умолчанию.
	Triangle()	{
		super (); 
		style = "null";
	}
	// Конструктор класса Triangle.
	Triangle(String s, double w, double h) {
		super(w, h); // вызвать конструктор суперкласса
		style = s;
	}
	// Конструктор с одним аргументом для построения треугольника.
	Triangle(double x) {
		super(x); // вызвать конструктор суперкласса 
		style = "isosceles";
	}
	// построить один объект на основании другого объекта 
	Triangle(Triangle ob) {
	// Передача ссылки на объект Triangle конструктору класса TwoDShape.
		super (ob);
		style = ob.style;
	}
	double area() {
		return getWidth() * getHeight() / 2;
	}
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
class Shapes7 {
	public static void main(String args[])	{
		Triangle t1 = new Triangle("right", 8.0, 12.0);
		// создать копию объекта t1 
		Triangle t2 = new Triangle(t1);
		
		System.out.println("Info for t1: "); 
		t1.showStyle(); 
		t1.showDim();
		System.out.println("Area is " + t1.area());
		System.out.println() ;
		
		System.out.println("Info for t2: "); 
		t2.showStyle(); 
		t2.showDim();
		System.out.println("Area is " + t2.area());
	}
}
