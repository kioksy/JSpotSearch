package org.jspotsearch.storageobjects;

import java.util.List;

public class Album {
	
	private String album;
	private String artist;
	private List<Song> tracks;
	private String yearOfRelease;
	
	public Album(String album, String artist, List<Song> tracks, String yearOfRelease){
		this.album = album;
		this.artist = artist;
		this.tracks = tracks;
		this.yearOfRelease = yearOfRelease;
	}
	
	/**
	 * The name of the album
	 * @return the name of the album
	 */
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	/**
	 * The name of the artist
	 * @return the name of the artist
	 */
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	/**
	 * All the songs in the album
	 * @return all the songs as Song object
	 */
	public List<Song> getTracks() {
		return tracks;
	}
	
	public void setTracks(List<Song> tracks) {
		this.tracks = tracks;
	}
	
	/**
	 * The year when the album was released
	 * @return year as string
	 */
	public String getYearOfRelease() {
		return yearOfRelease;
	}
	
	
	public void setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	@Override
	public String toString(){
		return "This album ( " + this.getAlbum() + " ) by: " + this.getArtist() +
			"has a total of: " + this.getTracks().size() + " songs.";
	}
}

