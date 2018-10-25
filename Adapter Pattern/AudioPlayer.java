package Structural.Adapter;

public class AudioPlayer implements MediaPlayer{
	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		// build-in mp3 file music play option
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file: " + fileName);
		}
		
		// providing support to other file formats
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else {
			System.out.println("Invalid media " + audioType + " format.");
		}
	}
}
