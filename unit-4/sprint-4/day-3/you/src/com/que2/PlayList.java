package com.que2;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	public List<Song> songs = new ArrayList<>();
	boolean take=true;
	public void addSong(Song song) {
		for(Song s1:songs) {
			if(s1.equals(song)) {
				System.out.println("Song is already added in the playlist");
				take=false;
				break;
			}
		}
		if(take==true) {
		songs.add(song);
		System.out.println("Song added to the playlist successfully");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
