package com.coderscampus;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int largerSize = 20;
	int sizeOfArray = 0;

	@Override
	public int getSize() {
		return sizeOfArray;
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if(items.length < index) {
			throw new IndexOutOfBoundsException(
					"Index: " + index + "out of bounds for array size: " + items.length);
		}

		return (T) items[index];
	}

	@Override
	public boolean add(T item) {
		if (sizeOfArray == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		items[sizeOfArray] = item;
		sizeOfArray++;
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index > items.length) {
			throw new IndexOutOfBoundsException("Choose an index within bounds for array size: " + sizeOfArray);
		}
		if (sizeOfArray == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
			
		}

//		if (items[index] != null) {
//			displacedItem = (T) items[index];
//			items[index] = item;
//			item = displacedItem;
//			items[index + 1] = item;
//			index++;
//		
//		}

		if (items[index] != null) {
			for (int i = sizeOfArray + 1; i >= index; i--) {
				items[i + 1] = items[i];
			}
			
		}
		items[index] = item;
		sizeOfArray++;
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

}