package com.kronoze;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class AZLyrics implements LyricsSource {

	private static String baseUrl = "http://www.azlyrics.com/";
	
	public String format(String artist, String song) {
		artist = artist.toLowerCase().replaceAll(" ", "").replaceAll("'", "");
		song = song.toLowerCase().replaceAll(" ", "").replaceAll("'", "");
		return baseUrl +"lyrics/" + artist + "/" + song;
	}
	
	public Document search(String query) throws IOException {
		Connection con = Jsoup.connect(baseUrl);
		con.post();
		return null;
	}
	
}
