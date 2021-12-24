package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.coderscampus.CustomArrayList;
import com.coderscampus.CustomList;

class CustomArrayListTest {

	@Test
	void should_add_one_item_to_list() {
		
//		Arrange: Instantiating the list.
		CustomList<Integer> sut = new CustomArrayList<>();
//		Act: Invoking the .add method.
		sut.add(10);
//		Assert: What would we expect to happen?
//		I would expect the custom list to have the Integer 10.
//		I would expect this 10 to be at the 0th index of the custom list.
		assertEquals(10, sut.get(0));
		assertEquals(1, sut.getSize());
	}
	@Test
	void should_add_11_items_to_list() {
//		Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
//		Act
		sut.add(1);sut.add(2);sut.add(3);sut.add(4);
		sut.add(5);sut.add(6);sut.add(7);sut.add(8);
		sut.add(9);sut.add(10);sut.add(11);
		for (int i=0; i<10; i++) {
			assertEquals(i+1, sut.get(i));
		}
		assertEquals(11, sut.getSize());
	}
	

}
