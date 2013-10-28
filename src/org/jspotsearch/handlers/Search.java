package org.jspotsearch.handlers;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jspotsearch.storageobjects.Song;

public class Search extends JSonparser{

	public List<Song> searchSong(String song){
		String json = getJsonFromUrl("http://ws.spotify.com/search/1/track.json?q="+song);
		ArrayList<Song> songs = new ArrayList<Song>();
		
		try {
			JSONObject object = new JSONObject(json);
			JSONArray array = object.getJSONArray("tracks");		
			
			for(int i=0; i<array.length(); i++){
				String name = (String) array.getJSONObject(i).get("name");
				String artist = array.getJSONObject(i).getJSONArray("artists").getJSONObject(0).getString("name");
				String href = (String) array.getJSONObject(i).get("href");
				String album = array.getJSONObject(i).getJSONObject("album").getString("name");
				double length = (double) array.getJSONObject(i).getDouble("length");
				
				songs.add(new Song(name,artist,album,href,length));
			}
			
			return songs;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return new ArrayList<Song>();
	}
	
	
}
