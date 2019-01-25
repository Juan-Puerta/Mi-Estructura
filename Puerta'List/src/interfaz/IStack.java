package interfaz;

import world.Nodo;

public interface IStack<T> {

	void push(T object);
	Nodo<T> pop();
	Nodo<T> peek();
	
}
