package com.coderscampus;




public class App {
	
  public void launch(){
		
			CustomList<Integer> myCustomList = new CustomArrayList<>();
			
			System.out.println("Array should contain 10 elements: 0-9");
			for (int i = 0; i < 10; i++) {
				myCustomList.add(i);
			}
			for (int i=0; i<myCustomList.getSize(); i++) {
				System.out.println(myCustomList.get(i));
			}
			System.out.println("Array should contain 11 elements: 50-9");
			myCustomList.add(0, 50);
			for (int i=0; i<myCustomList.getSize(); i++) {
				System.out.println(myCustomList.get(i));
			}
			System.out.println("Array should contain 10 elements: 0-9");
			myCustomList.remove(0);
			for (int i=0; i<myCustomList.getSize(); i++) {
				System.out.println(myCustomList.get(i));
			}
			
			System.out.println("The new array size should be 10: " + myCustomList.getSize());
			System.out.println("---------------------");
			System.out.println("The get method works: should return 1: " + myCustomList.get(1));
			
			System.out.println("---------------------");
			System.out.println("The add method works: should return \"true\" " + myCustomList.add(12));
			System.out.println("---------------------");

		}

	}
