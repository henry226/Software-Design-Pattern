package Structural.Adapter;

public class Demo {

	public static void main(String[] args) {
		AudioPlayer ap = new AudioPlayer();
		
		ap.play("mp3", "Alan Walker - Faded");
		ap.play("vlc", "Naruto Shippuden");
		ap.play("mp4", "Design Pattern Tutorial");
		ap.play("avi", "Iron Man");
	}

}
