package com.code.collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities); 
	    System.out.println("-------------------------------------------");
	    
	    //Copy of Hashmap
	    HashMap duplicateHM = (HashMap)capitalCities.clone();
	    duplicateHM.remove("England");
	    System.out.println(capitalCities);
	    System.out.println("-------------------------------------------");
	    System.out.println(duplicateHM);
	    System.out.println("-------------------------------------------");
	    
	    //compute() method changes the value of an entry or creates a new value if the entry does not exist.
	    capitalCities.compute("England", (k,v) -> v+"("+k+")");
	    System.out.println(capitalCities);
	    System.out.println("-------------------------------------------");
	   
	    //computeIfAbsent - method calculates a value for a new entry based on its key. If an entry with the specified key already exists and its value is not null then the map is not changed.
	    capitalCities.computeIfAbsent("Canada", (k) -> "Toronto ("+k+")");
	    System.out.println(capitalCities);
	    System.out.println("-------------------------------------------");
	    
	    //computeIfPresent - method calculates a value for an entry based on its key. If an entry with the specified key does not exist or its value is null then the map is not changed.
	    capitalCities.computeIfPresent("England", (k, v) -> v+"(English)");
	    System.out.println(capitalCities);
	    System.out.println("-------------------------------------------");
	    
	    //containsKey/Value
	    System.out.println("Search element Key present in the map is : "+capitalCities.containsKey("England"));
	    System.out.println("Search element Value present in the map is : "+capitalCities.containsValue("Oslo"));
	    System.out.println("-------------------------------------------");
	    
	    //Iterating HashMap
	    capitalCities.forEach((k,v) ->{System.out.println(k+"->"+v);});
	    System.out.println("-------------------------------------------");
	    
	    //Retrieve Keys and values separately 
	    System.out.println("Keys:"+capitalCities.keySet());
	    System.out.println("Values:"+capitalCities.values());
	    System.out.println("-------------------------------------------");
	    
	   

	}

}
