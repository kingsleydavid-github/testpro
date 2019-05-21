package com.redmart.skiing;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MapRoute {
	
	private List<Integer> path;

	public Integer getPathValue(List<Integer> path)
	{
		return getPathValueForPath(path);
	}

	private Integer getPathValueForPath(List<Integer> path) {
		
		Iterator<Integer> itr = path.iterator();
		
		AtomicInteger it = new AtomicInteger();
		
		while(itr.hasNext())
		{
			it.updateAndGet(prev -> (
						prev - itr.next()) 
					);
		}
		
		System.out.println(it);
		return it.get();
	}

}
