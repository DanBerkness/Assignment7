package com.coderscampus;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int largerSize = 20;
	int actualSizeCtr = 0;

	@Override
	public int getSize() {
		return actualSizeCtr;
	}

	@Override
	public T get(int index) {
		
			T item = (T) items[index];
			
			return item;
	}

	
	@Override
	public boolean add(T item) {
		
		if (actualSizeCtr < items.length -1) {
			for (Object object : items) {
				if (items[actualSizeCtr] == null) {
					items[actualSizeCtr] = item;
					break;
				}
			}
		} else if (actualSizeCtr == items.length -1) {
			if (items[actualSizeCtr] == null) {
				items[actualSizeCtr] = item;
			}
			largerSize = items.length * 2;
			Object[] largerArray = new Object[largerSize];
			for (int i = 0; i < largerSize; i++) {
				if (i < items.length) {
					largerArray[i] = items[i];
				} else {
					items = largerArray;
					break;
				}
			}
		}
		if (item != null) {
			actualSizeCtr++;
			return true;
		}
		return false;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		 if (index <= items.length ) {
			 if (items[index] != null) {
				 T displacedItem = (T) items[index];
				 items[index + 1] = displacedItem;
				 if (items[index + 1] != null) {
//					 THe above loop may have to be a while, or this could go on for ever...I think???
				 }
			 }
		 }
		
		return false;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}
	
}