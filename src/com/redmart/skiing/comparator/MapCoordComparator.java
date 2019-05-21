package com.redmart.skiing.comparator;

import java.util.Comparator;
import java.util.Map.Entry;

import com.redmart.skiing.MapCoordinate;

public class MapCoordComparator implements Comparator<Entry<MapCoordinate, Integer>> {

	@Override
	public int compare(Entry<MapCoordinate, Integer> o1, Entry<MapCoordinate, Integer> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}

}
