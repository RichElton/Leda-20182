package estruturasrecursivas.linkedlistdupla;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		LinkedListDupla<Integer> lista = new RecursiveLinkedListDupla<>();
		lista.insert(0);
		System.out.println(Arrays.toString(lista.toArray()));
		lista.insert(25);
		System.out.println(Arrays.toString(lista.toArray()));
		lista.remove(1);
		System.out.println(Arrays.toString(lista.toArray()));
		
		lista.insert(10);
		System.out.println(Arrays.toString(lista.toArray()));
		
		System.out.println(lista.search(10));
		
		lista.removeFirst();
		lista.removeLast();
		
		System.out.println(Arrays.toString(lista.toArray()));
		/*lista.insertFirst(-5);
		System.out.println(Arrays.toString(lista.toArray()));
		
		lista.remove(-5);
		System.out.println(Arrays.toString(lista.toArray()));
		
		lista.insert(20);
		System.out.println(Arrays.toString(lista.toArray()));
		
		lista.insertFirst(-50);
		System.out.println(Arrays.toString(lista.toArray()));
		
		lista.removeFirst();
		System.out.println(Arrays.toString(lista.toArray()));
		
		lista.insertFirst(-200);
		System.out.println(Arrays.toString(lista.toArray()));
		
		lista.removeLast();
		System.out.println(Arrays.toString(lista.toArray()));
		
		lista.insert(90);
		System.out.println(Arrays.toString(lista.toArray()));
		
		lista.insertFirst(800);
		System.out.println(Arrays.toString(lista.toArray()));
		
		System.out.println(lista.maiorElemento());*/
	}

}
