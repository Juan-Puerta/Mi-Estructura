package interfaz;

import world.Nodo;

public interface IQueue<T> {

	void push(T object);
	Nodo<T> poll();
	Nodo<T> peek();
	
}
