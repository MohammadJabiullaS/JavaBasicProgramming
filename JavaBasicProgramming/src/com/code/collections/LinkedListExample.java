package com.code.collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Audi");
	    cars.add("Mercedes");
	    cars.add("Ferrari");
	    System.out.println(cars);
	    System.out.println(("----------------------------------"));
	    //addAll() Add items from one list into another
	    LinkedList<String> brands = new LinkedList<String>();
	    brands.add("Microsoft");
	    brands.add("W3Schools");
	    brands.add("Apple");
	    
	    brands.addAll(cars);
	    
	    System.out.println(brands);
	    System.out.println(("----------------------------------"));
	    
	    //Linked list has clone(), clear(), contains(), forEach(), get() methods same as ArrayList
	    
	    //getFrist/Last - get the first/last item from the list
	    System.out.println("First item from the list is: "+cars.getFirst());
	    System.out.println("Last item from the list is: "+ cars.getLast());
	    System.out.println(("----------------------------------"));
	    
	    //indexOf(), iterator(), lastIndex(), listIterator(), remove, removeAll() same as ArrayList methods
	    
	    //removeFirst(), removeLast()
	    System.out.println("Remove the first item from the list: "+cars.removeFirst());
	    System.out.println("Remove the last item from the list: "+cars.removeLast());
	    System.out.println(("----------------------------------"));
	    
	    //removeIf()
	    LinkedList<Integer> numbers = new LinkedList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(6);
	    numbers.add(1);
	    numbers.removeIf( n -> n % 2 == 0 );
	    System.out.println(numbers);
	    System.out.println(("----------------------------------"));
	    
	    

	}

}
