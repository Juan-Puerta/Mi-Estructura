package world;

import interfaz.IStack;

public class Stack<T> implements IStack<T> {

	private int size;
	private Nodo<T> root;
	
	public Stack() {
		// TODO Auto-generated constructor stub
		size = 0;
		root = null;
	}
	
	@Override
	public void push(T object) {
		// TODO Auto-generated method stub
		Nodo<T> theNodo = new Nodo<T>(object);
		if(root == null) {
			root = theNodo;
		}else {
			Nodo<T> aux = root;
			while(aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(theNodo);;
		}
		size++;
	}

	@Override
	public Nodo<T> pop() {
		// TODO Auto-generated method stub
		if(root == null) {
			return null;
		}else {
			Nodo<T> aux = root;
			while(aux.getNext() != null) {
				aux = aux.getNext();
			}
			Nodo<T> deleted = aux;
			aux = null;
			size--;
			return deleted;
		}
	}

	@Override
	public Nodo<T> peek() {
		// TODO Auto-generated method stub
		if(root == null) {
			return null;
		}else {
			Nodo<T> aux = root;
			while(aux.getNext() != null) {
				aux = aux.getNext();
			}
			return aux;
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Nodo<T> getRoot() {
		return root;
	}

	public void setRoot(Nodo<T> root) {
		this.root = root;
	}

	

	
	
}
