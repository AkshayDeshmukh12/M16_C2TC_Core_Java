package com.india.m16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Examp4 {

	public static void main(String[] args) {
		Map<Integer,Integer>a=new HashMap<Integer,Integer>();
		a.put(1, 124);
		a.put(6, 654);
		System.out.println(a);
		Set<Entry<Integer,Integer>>b=a.entrySet();
		Iterator<Map.Entry<Integer,Integer>>itr=b.iterator();
		while(itr.hasNext())
		{
			Map.Entry e1=itr.next();
			System.out.println(e1.getKey()+" "+e1.getValue());
		}

	}

}
