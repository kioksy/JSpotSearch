package org.jspotsearch.storageobjects;

public class Song {
	
	private String track;
	private String artist;
	private String album;
	private String href;
	private int duration;
	
	/**
	 * If you ever feel like creating an empty instance of a song...
	 */
	public Song(){
		
	}
	
	/**
	 * Creates a single instance of a song
	 * @param track name of the song
	 * @param artist name of the artist
	 * @param album name of the occuring album
	 * @param href link to the song (Spotify URI)
	 * @param duration duration of song
	 */
	public Song(String track, String artist, String album, String href, int duration){
		this.track = track;
		this.artist = artist;
		this.album = album;
		this.href = href;
		this.duration = duration;
	}
	
	/**
	 * get the name of the track
	 * @return name of the track
	 */
	public String getTrack() {
		return track;
	}
	
	public void setTrack(String name) {
		this.track = name;
	}
	
	/**
	 * Get the name of the artist
	 * @return
	 */
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * Get the name of the occuring album
	 * @return the name of the occuring album
	 */
	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	/**
	 * Get the Href as Spotify URI
	 * @return
	 */
	public String getHref() {
		return href;
	}
	
	/**
	 * returns the Href as HTTP Link
	 * @return
	 */
	public String getHTTPLink(){
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * Duration of the song
	 * @return duration in seconds
	 */
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString(){
		return "Track : " + this.getTrack() + " by artist: " + this.getArtist() + 
		" from the album: " + this.getAlbum() + " with the duration: " + this.getDuration()
		+ " seconds";
	}

}
