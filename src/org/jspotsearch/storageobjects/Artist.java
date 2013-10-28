package org.jspotsearch.storageobjects;

import java.util.List;

public class Artist {
	
	private String name;
	private Double popularity;
	private List<Album> albums;
	
	/**
	 * Creates an instance of an Artist
	 * @param name name of the artist
	 * @param popularity popularity of artist on spotify (Double)
	 * @param albums List of albums for the artist
	 */
	public Artist(String name, Double popularity, List<Album> albums){
		this.name = name;
		this.popularity = popularity;
		this.albums = albums;
	}
	
	/**
	 * Get the name of the artist
	 * @return the name of the artist
	 */
	public String getArtist() {
		return name;
	}
	public void setArtist(String name) {
		this.name = name;
	}
	
	/**
	 * get the popularity of the artist
	 * @return popularity (Double)
	 */
	public Double getPopularity() {
		return popularity;
	}
	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}
	
	/**
	 * List of Albums for the artist
	 * @return a list of albums
	 */
	public List<Album> getAlbums() {
		return albums;
	}
	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

}
