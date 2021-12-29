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
	public T get(int index) {

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

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		T displacedItem = null;

		if (items[index] != null) {
			displacedItem = (T) items[index];
			items[index] = item;
			item = displacedItem;
			System.out.println(items[index]);
			index++;
		}

		if (sizeOfArray == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
			items[index] = item;
			sizeOfArray++;

		}

		if (index > items.length) {
			throw new IndexOutOfBoundsException("Choose an index within bounds for array size: " + index);
		}
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

}