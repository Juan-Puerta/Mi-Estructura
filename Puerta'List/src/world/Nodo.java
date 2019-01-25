package world;

public class Nodo<T> {

	private T date;
	private Nodo<T> next;
	
	public Nodo(T date) {
		this.date = date;
		next = null;
	}

	public Nodo<T> getNext() {
		return next;
	}

	public void setNext(Nodo<T> next) {
		this.next = next;
	}

	public T getDate() {
		return date;
	}

	public void setDate(T date) {
		this.date = date;
	}
	
}
