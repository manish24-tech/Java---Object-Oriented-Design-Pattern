package com.practice.iterator.adt;

import com.practice.iterator.generic.Collection;
import com.practice.iterator.generic.Iterator;

public class Container<E> implements Collection<E> {

	Object[] elementData; 
	
	@Override
	public Object[] addElement(Object[] element) {
		if(element != null && element.length > 0) { 
			this.elementData = element; 
		} 
		return elementData;
	}

	@Override
	public Iterator<E> iterator() {
		return new Itr();
	}

	private class Itr implements Iterator<E> {

		int index = 0;
		@Override
		public boolean hasNext() {
			if (index < elementData.length)
				return true;

			return false;
		}

		@Override
		public E next() {
			if (this.hasNext())
				return (E) elementData[index++];
			return null;
		}

	}


	
}
