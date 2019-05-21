package com.redmart.skiing;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Skiing {

	private static final String NORTH = "NORTH";
	private static final String SOUTH = "SOUTH";
	private static final String EAST = "EAST";
	private static final String WEST = "WEST";

	public static void main(String[] args) {

		/*
		 	4 4 
			4 8 7 3 
			2 5 9 3 
			6 3 2 5 
			4 4 1 6
			
			9-5-3-2-61
			8-5-3-2-1
		 */
		
		Scanner sysin = new Scanner(System.in);
		
		int xlimit = sysin.nextInt();
		int ylimit = sysin.nextInt();
		
		Map<MapCoordinate, Integer> skimap = new LinkedHashMap<>();
		
		for(int xcoord = 0; xcoord < xlimit; xcoord++  )
		{
			for(int ycoord = 0; ycoord < ylimit; ycoord++  )
			{
				skimap.put(new MapCoordinate(xcoord, ycoord), sysin.nextInt());
			}
		}

		System.out.println("\n" + traverseMap(skimap, null));
		sysin.close();
	}

	private static MapCoordinate getCoordinatesByDirection(String direction, MapCoordinate coordinates) {
		
		switch(direction)
		{
			case NORTH:
				return getNorthCoordinates(coordinates);
			case SOUTH:
				return getSouthCoordinates(coordinates);
			case WEST:
				return getWestCoordinates(coordinates);
			case EAST:
				return getEastCoordinates(coordinates);
			default:
				return null;
		}
	}

	private static MapCoordinate getNorthCoordinates(MapCoordinate coordinate) {
		return new MapCoordinate(coordinate.getX() - 1, coordinate.getY());
	}
	private static MapCoordinate getSouthCoordinates(MapCoordinate coordinate) {
		return new MapCoordinate(coordinate.getX() + 1, coordinate.getY());
	}
	private static MapCoordinate getEastCoordinates(MapCoordinate coordinate) {
		return new MapCoordinate(coordinate.getX(), coordinate.getY() + 1);
	}
	private static MapCoordinate getWestCoordinates(MapCoordinate coordinate) {
		return new MapCoordinate(coordinate.getX(), coordinate.getY() - 1);
	}

	public boolean isValidPath(Map<MapCoordinate, Integer> skimap, MapCoordinate coord, Integer currentValue)
	{
		return (skimap.containsKey(coord) && skimap.get(coord) > currentValue);
	}
}
