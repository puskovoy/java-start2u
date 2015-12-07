// Применение динамической диспетчеризации методов, 
class TwoDShape {
	private double width; 
	private double height; 
	private String name;
	// Конструктор по умолчанию.
	TwoDShape()	{
		width = height = 0.0; 
		name = "null";
	}
	// Параметризированный конструктор.
	TwoDShape(double w, double h, String n) { 
		width = w; 
		height = h; 
		name = n;
	}
	// построить объект с одинаковыми значениями 
	// переменных экземпляра width и height 
	TwoDShape(double x, String n) { 
		width = height = x; 
		name = n;
	}
	// построить один объект на основании другого объекта 
	TwoDShape(TwoDShape ob) { 
		width = ob.width; 
		height = ob.height; 
		name = ob.name;
	}
	// Методы доступа к переменным width и height, 
	double getWidth() { return width; } 
	double getHeight() { return height; } 
	void setWidth(double w) { width = w; } 
	void setHeight(double h) { height = h; }
	String getName() { return name; }
	void showDim() {
		System.out.println("Width and height are " +
			width + " and " + height);
	}
	// Метод area() определен в классе TwoDShape. 
	double area() { 
		System.out.println("area() must be overridden"); 
		return 0.0;
	}
}
	// Подкласс, производный от класса TwoDShape,
	// для представления треугольников, 
class Triangle extends TwoDShape { 
	private String style;
	// Конструктор по умолчанию.
	Triangle() {
		super(); 
		style = "null";
	}
	// Конструктор класса Triangle.
	Triangle(String s, double w, double h) { 
		super(w, h, "triangle");
		style = s;
	}
	// Конструктор с одним аргументом для построения треугольника 
	Triangle(double x) {
		super(x, "triangle"); // вызвать конструктор суперкласса 
		style = "isosceles";
	}
	// построить один объект на основании другого объекта 
	Triangle(Triangle ob) {
		super(ob); // передать объект конструктору класса TwoDShape 
		style = ob.style;
	}
	// Переопределение метода area() для класса Triangle. 
	double area() {
		return getWidth() * getHeight() / 2;
	}
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
// Подкласс, производный от класса TwoDShape,
// для представления прямоугольников, 
class Rectangle extends TwoDShape {
	// Конструктор по умолчанию.
	Rectangle() {
		super();
	}
	// Конструктор класса Rectangle. 
	Rectangle(double w, double h) {
		super(w, h, "rectangle"); // вызвать конструктор суперкласса
	}
	// построить квадрат 
	Rectangle(double x) {
		super(x, "rectangle"); // вызвать конструктор суперкласса
	}
	// построить один объект на основании другого объекта 
	Rectangle(Rectangle ob) {
		super(ob); // передать объект конструктору класса TwoDShape
	}
	boolean isSquare() {
		if (getWidth () == getHeight()) 
			return true; 
		return false;
	}
	// Переопределение метода area() для класса Rectangle. 
	double area() {
		return getWidth () * getHeight();
	}
}
class DynShapes {
	public static void main(String args[]) {
		TwoDShape shapes[] = new TwoDShape[5];
		shapes[0] = new Triangle("right", 8.0, 12.0);
		shapes[1] = new Rectangle(10) ;
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);
		shapes[4] = new TwoDShape(10, 20, "generic");
		
		for(int i=0; i < shapes.length; i++) {
			System.out.println("object is " + shapes[i].getName());
			// Требуемый вариант метода area () вызывается 
			// для каждой геометрической фигуры в отдельности.
			System.out.println("Area is " + shapes[i].area());
			System.out.println();
		}
	}
}
