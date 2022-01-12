package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import com.coderscampus.CustomArrayList;
import com.coderscampus.CustomList;
import com.coderscampus.Main;

class CustomArrayListTest {
	@Test
	void should_test_if_get_method_works() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		assertEquals(0, sut.get(0));
	}

	@Test
	void should_test_for_failure_in_get_method() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
	
		assertThrows(IndexOutOfBoundsException.class, () -> sut.get(20));
	
	}
	@Test
	void doubling_array_test() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 11; i++) {
			sut.add(i);
		}
		assertEquals(20, sut.getSize());
	}
	@Test
	void should_add_item_to_list_at_0_index() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		sut.add(0, 1);
		assertEquals(1, sut.get(0));
	}

	

	@Test
	void should_remove_an_item_from_list_at_zeroth() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		sut.add(33);
		sut.remove(0);
		assertEquals(1, sut.get(0));
	}

	@Test
	void should_remove_item_from_list_at_eleventh() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 11; i++) {
			sut.add(i);
		}
		sut.add(11, 0);

		assertEquals(0, sut.get(11));
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

	@Test
	void should_get_custom_list_size_after_doubling() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 20; i++) {
			sut.add(i);
		}
		assertEquals(20, sut.getSize());
	}

}
