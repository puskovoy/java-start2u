// interface очереди для хранения символов с генерированием исключений, 
public interface ICharQ2 {
	// поместить символ в очередь
	void put(char ch) throws QueueFullException;
	// извлечь символ из очереди
	char get() throws QueueEmptyException;
}
