package com.code.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring the ArrayList with it's type and the size of the ArrayList is autogrow
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Audi");
	    cars.add("Mercedes");
	    cars.add("Ferrari");
	    System.out.println(cars);
	    
	    //addAll() - Add itesm from one list into another
	    ArrayList<String> brands = new ArrayList<String>();
	    brands.add("Microsoft");
	    brands.add("W3Schools");
	    brands.add("Apple");
	   
	    brands.addAll(cars);
	    System.out.println(brands);
	    
	    //Clear() - Remove all the items from the list
	    cars.clear();
	    System.out.println(cars);
	    
	    //adding items back to car arraylist
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Audi");
	    cars.add("Mercedes");
	    cars.add("Ferrari");
	    
	    //clone() create copy of list
	    ArrayList cars2=(ArrayList)cars.clone();
	    System.out.println(cars);
	    System.out.println(cars2);
	    
	    //contains - check the item exists in the list
	    System.out.println("Item available in the list is : "+cars.contains("BMW"));
	    
	    //ensureCapacity()
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i=1; i<=15; i++)
	    {
	    	list.add(i);
	    }
	    System.out.println(list);
	    
	    //forEach() - iterate all the itesm from the list
	    list.forEach( (n) ->{System.out.println(n);});
	    
	    //get() - get the value of the item from the index
	    System.out.println(cars.get(2));
	    
	    //indexOf() get the index of the item from list
	    System.out.println(cars.indexOf("Ford"));
	    
	    //iterator() - loop
	    Iterator<String> iterator = cars.iterator();
	    while(iterator.hasNext())
	    {
	    	System.out.println(iterator.next());
	    }
	    
	    //loopIterator() - forward and backward direction in list
	    ListIterator<String> literator = cars.listIterator();
	    while(literator.hasNext())
	    {
	    	System.out.println(literator.next());
	    }
	    System.out.println(("----------------------------------"));
	    while(literator.hasPrevious())
	    {
	    	System.out.println(literator.previous());
	    }
	    System.out.println(("----------------------------------"));
	    
	    //remove and removeAll()
	    cars2.remove(2);
	    System.out.println(cars);
	    System.out.println(("----------------------------------"));
	    cars2.removeAll(cars2);
	    System.out.println(cars2);
	    System.out.println(("----------------------------------"));
	    
	    //Set() replace item in the index
	    cars.set(0, "Opel");
	    System.out.println(cars);
	    System.out.println(("----------------------------------"));
	    
	    //size() lenght of the list
	    System.out.println("Size of the cars list is :"+ cars.size());
	    System.out.println(("----------------------------------"));
	   
	    //sort the list
	    cars.sort(null);
	    System.out.println(cars);
	    System.out.println(("----------------------------------"));
	    
	    //Collections
	    Collections.sort(cars);
	    System.out.println(cars);
	    System.out.println(("----------------------------------"));
	    Collections.sort(cars, Collections.reverseOrder());
	    System.out.println(cars);
	    System.out.println(("----------------------------------"));
	    
	}

}
