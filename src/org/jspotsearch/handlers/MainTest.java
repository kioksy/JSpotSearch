package org.jspotsearch.handlers;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import org.jspotsearch.storageobjects.Song;

public class MainTest extends JSonparser {
	
	public static void main(String[] args){
		
		Search search = new Search();
		
		ArrayList<Song> result = (ArrayList<Song>) search.searchSong("foo");
		
		System.out.println(result.get(22).toString());
	}

}
