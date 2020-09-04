package com.practice.iterator.generic;

public interface Collection<E> {
	
	Iterator<E> iterator();
	
	Object[] addElement(Object[] element);

}
