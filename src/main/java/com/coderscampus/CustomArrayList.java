package com.coderscampus;

import java.util.Arrays;

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
		if (actualSizeCtr == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		items[actualSizeCtr] = item;
		actualSizeCtr++;
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		T displacedItem = null;
		if (index < items.length) {
			if (items[index] != null) {
				displacedItem = (T) items[index];
				items[index] = item;
				item = displacedItem;
				System.out.println(items[index]);
				index++;
			} else {
				items[index] = item;
			}
		} else if (index == items.length){
			items = Arrays.copyOf(items, items.length * 2);
			items[index] = item;
			
		} else if (index > items.length) {
			while (index > items.length) {
				items = Arrays.copyOf(items, items.length * 2);
			}
			items[index] = item;
		}

		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

}