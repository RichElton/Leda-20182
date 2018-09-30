package estruturas.linkedlist.linkeddupla;

import estruturas.linkedlist.linkedsimples.LinkedList;

public interface LinkedListDupla<T extends Comparable<T>> extends LinkedList<T>{
	
	/**
	 * M�todo que insere no inicio da lista.
	 * 
	 * @param element Elemento a ser adicionado.
	 */
	public void insertFirst(T element);
	/**
	 * M�todo que remove o primeiro elemento.
	 */
	public void removeFirst();
	/**
	 * M�todo que remove o �ltimo elemento.
	 */
	public void removeLast();
	
}