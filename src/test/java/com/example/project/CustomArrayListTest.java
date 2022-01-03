package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.coderscampus.CustomArrayList;
import com.coderscampus.CustomList;

class CustomArrayListTest {

	@Test
	void should_add_item_to_list_at_0_index() {

		CustomList<Integer> sut = new CustomArrayList<>();

		sut.add(0, 10);

		assertEquals(10, sut.get(0));
	}

	@Test
	void should_add_item_to_list_at_10_index() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		sut.add(10, 111);

		assertEquals(111, sut.get(10));
	}
	
	
	
	@Test
	void should_remove_an_item_from_list() {
//		Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
//		Act
		sut.add(33);
		sut.remove(0);
//		Assert
		assertEquals(1, sut.get(0));
	}

	@Test
	void should_get_custom_list_size() {
		CustomList<Integer> sut = new CustomArrayList<>();
		sut.add(1);
		sut.add(2);
		sut.add(3);
		sut.add(4);
		assertEquals(4, sut.getSize());
	}

}
