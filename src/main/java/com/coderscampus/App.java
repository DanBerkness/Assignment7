package com.coderscampus;




public class App {
	
  public void launch(){
		
			CustomList<Integer> myCustomList = new CustomArrayList<>();
			int addCounter = 0;
			for (int i = 0; i < 10; i++) {
				myCustomList.add(addCounter++);
			}
			
			myCustomList.add(0, 39);
			
					
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
