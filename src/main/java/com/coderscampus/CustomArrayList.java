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
}