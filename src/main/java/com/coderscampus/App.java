package com.coderscampus;




public class App {
	
  public void launch(){
		
			CustomList<Integer> myCustomList = new CustomArrayList<>();
			
			myCustomList.add(0, 0);
			myCustomList.add(1, 1);
			myCustomList.add(2, 2);
			myCustomList.add(3, 3);
			myCustomList.add(4, 4);
			myCustomList.add(5, 5);
			myCustomList.add(6, 6);
			myCustomList.add(7, 7);
			myCustomList.add(8, 8);
			myCustomList.add(9, 9);
			myCustomList.add(10, 10);
			myCustomList.add(11, 11);
			myCustomList.add(0, 30);
			myCustomList.add(100, 7);
			
					
			System.out.println("The new array size is " + myCustomList.getSize());
			System.out.println("---------------------");
			System.out.println("The get method works " + myCustomList.get(1));
			
			System.out.println("---------------------");
			System.out.println("The add method works " + myCustomList.add(12));
			System.out.println("---------------------");
			for (int i=0; i<myCustomList.getSize(); i++) {
			    System.out.println(myCustomList.get(i));
			}

		}

	}
