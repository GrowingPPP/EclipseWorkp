package com.zgh.test;

import java.util.HashSet;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//public class TestMap {
//	//获得线程安全的Hashmap
//	Map map = (Map) Collections.synchronizedMap(new HashMap()); 
//}
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestMap {
	
    public static void main(String[] args) {
	    Set<String> set = new TreeSet<String>();
	    set.add(new String("aaa"));
	    set.add(new String("bbb"));
	    set.add(new String("ccc"));
	    set.add(new String("ddd"));
	    
	    System.out.println(set);
	       
    }
}