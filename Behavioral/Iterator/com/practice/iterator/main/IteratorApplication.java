package com.practice.iterator.main;

import com.practice.iterator.adt.Container;
import com.practice.iterator.generic.Iterator;

/**
 * 
 * Iterator provide standard way to access element from group of object sequentially with making business logic  representation protected from the client
* In java, Collection framework is the example of iterator design pattern and allowing user to use various types of abstract data type(ArrayList, DeQueue, Hashset..etc) to traverse the element with advance feature(add,remove,equal..etc)
* Purpose of iterator design pattern is to traverse an elements of group of object using various data structure like Stack, Queue, LinkedList, ArrayList, Map...etc
* Basic implementation [defined in java itself with advance feature with so many abstraction level but we will simplify it]:
*   *`=> create an generic interface Iterator<E> with hashNext() and next() method definition`*
*   *`=> create generic interface Collection<E> that have reference of the type of Iterator<E> interface that responsible to create/initialize generic type of iterator in its implementation class`*
*   *`=> create generic container class<E>  implement Collection<E> for Itr initialization and also create nested private Itr class implements Iterator<E> with hasNext() and next() representation`*
*   *`=> in client application we can get the list of the type of iterator and traverse an element based on hasNext() and next() bonding`*
* At the end iterator is used to traversing element from group of object with protecting internal representation from client and create ADT(abstract data type) with various data structure to manage the collections
 * @author Manish Luste
 *
 */
public class IteratorApplication {

	public static void main(String[] args) {
		Container<String> contImpl = new Container<>();
		
		Object[] asList = {"Man","Nan","Ken","Den"};
		contImpl.addElement(asList);
		Iterator<String> createIterator = contImpl.iterator();
		
		while(createIterator.hasNext()) {
			System.out.println("IteratorApplication.main() => "+ createIterator.next());
		}
		
	}
}
