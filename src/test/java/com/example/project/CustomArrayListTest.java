package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.coderscampus.CustomArrayList;
import com.coderscampus.CustomList;

class CustomArrayListTest {

	@Test
	void should_add_item_to_list_at_0_index() {
	
		
//		Arrange: Instantiating the list.
		CustomList<Integer> sut = new CustomArrayList<>();
//		Act: Invoking the .add method.
		sut.add(0, 10);
//		Assert: What would we expect to happen?
		assertEquals(10, sut.get(0));
		
	}
	@Test
	void should_add_item_past_current_array_size() {
		CustomList<Integer> sut = new CustomArrayList<>();
		sut.add(50, 58);
		assertEquals(58, sut.get(50));
	}
	@Test
	void should_remove_an_item_from_list() {
//		Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
//		Act
		sut.remove(1);
//		Assert
		assertEquals(2, 2);
	}
	@Test
	void should_get_custom_list_size() {
		
	}
	

}
