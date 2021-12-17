package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.coderscampus.CustomArrayList;
import com.coderscampus.CustomList;

class CustomArrayListTest {

	@Test
	void should_add_one_item_to_list() {
		
//		Arrange: Instantiating the list.
		CustomList<Integer> customList = new CustomArrayList<>();
//		Act: Invoking the .add method.
		customList.add(10);
//		Assert: What would we expect to happen?
//		I would expect the custom list to have the Integer 10.
//		I would expect this 10 to be at the 0th index of the custom list.
		assertEquals(10, customList.get(0));
		assertEquals(1, customList.getSize());
	}

}
