package org.jspotsearch.handlers;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import org.jspotsearch.storageobjects.Song;

public class MainTest extends JSonparser {
	
	public static void main(String[] args){
		
		Search search = new Search();
		
		ArrayList<Song> result = (ArrayList<Song>) search.searchSong("foo");
		
		ArrayList<Song> result2 = (ArrayList<Song>) search.searchSong("hey%20ho");
		
		for(int i=0; i<100; i++){
			System.out.println(result.get(i));
			System.out.println(result2.get(i));
		}
	}

}
