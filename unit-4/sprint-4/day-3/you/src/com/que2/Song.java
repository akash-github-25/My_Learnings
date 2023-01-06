package com.que2;

public class Song {
	private String movieName;
	private String songName;
	@Override
	public boolean equals(Object obj) {
		Song s1=this;
		Song s2=(Song)obj;
		if(s1.movieName.equals(s2.movieName) && s1.songName.equals(s2.songName)) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return songName.length();
	}
	
	public Song(String movieName, String songName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}
	public void play() {
		System.out.println(songName+ "of "+movieName+" is playing...!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Song s1=new Song("msdhoni","watan");
// Song s2=new Song("msdhoni","watan");
// if(s1.equals(s2)) {
//	 s1.play();
// }
//	}

}
}
