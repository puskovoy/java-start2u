public interface Series {
	int getNext(); // возвратить следующее по порядку число
	void reset(); // начать все с самого сначала
	void setStart(int x); // задать начальное значение
}