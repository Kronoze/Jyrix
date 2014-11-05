package com.kronoze;

import org.jsoup.nodes.Document;

public interface LyricsSource {

	public String baseUrl = "";
	public String format(String artist, String song);
	public Document search(String query) throws java.io.IOException;
	
}
