// Возврат объекта типа String, 
class ErrorMsg {
	String msgs[] = {
		"Output Error",		// #1 ошибка
		"Input Error",		// #2 ошибка
		"Disk Full",		// #3 ошибка
		"Index Out-Of-Bounds"// #4 ошибка 
	};
	// возвратить объект типа String в виде сообщения об ошибке 
	String getErrorMsg(int i) { 
		if(i >=0 & i < msgs.length) 
			return msgs[i]; 
		else
			return "Invalid Error Code";
	}
}
class ErrMsg {
	public static void main(String args[]) {
		
		ErrorMsg err = new ErrorMsg();
		
		System.out.println(err.getErrorMsg(2)) ;
		System.out.println(err.getErrorMsg(19));
	}
}
