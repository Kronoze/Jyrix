package com.kronoze;

public class Lyrics {
	
	private String artist;
	private String song;
	private StringBuilder lyrics;
	
	public Lyrics(String artist, String song) {
		this.artist = artist;
		this.song = song;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getSong() {
		return song;
	}
	
	public void setSong(String song) {
		this.song = song;
	}
	
	public String getLyrics() {
		return lyrics.toString();
	}

}
