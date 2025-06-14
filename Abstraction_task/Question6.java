//6. You are developing a media player application.

//There is a base class called MediaPlayer, which has methods like 
//play(), pause(), and stop().

//The VideoPlayer class inherits from MediaPlayer and adds methods like 
//rewind() and fastForward(). 

//Additionally, there is an interface called Playlist, which defines methods like 
//addSong() and removeSong(). 

//The VideoPlayer class implements the Playlist interface. 
//Implement the classes and demonstrate inheritance 
//with interface by creating objects of the VideoPlayer class and 
//calling its methods as well as the interface methods.

class MediaPlayer {
    public void play() {
        System.out.println("Playing media...");
    }
    
    public void pause() {
        System.out.println("Media paused.");
    }
    
    public void stop() {
        System.out.println("Media stopped.");
    }
}

interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class VideoPlayer extends MediaPlayer implements Playlist {
    @Override
    public void play() {
        System.out.println("Playing video...");
    }
    
    public void rewind() {
        System.out.println("Rewinding video...");
    }
    
    public void fastForward() {
        System.out.println("Fast forwarding video...");
    }
    
    @Override
    public void addSong(String song) {
        System.out.println("Added song: " + song + " to playlist");
    }
    
    @Override
    public void removeSong(String song) {
        System.out.println("Removed song: " + song + " from playlist");
    }
}

public class Question6 {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        //for mediaplayer
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();
        // for VideoPlayer
        videoPlayer.rewind();
        videoPlayer.fastForward();
        // for Playlist interface
        videoPlayer.addSong("Imagine");
        videoPlayer.removeSong("Yesterday");
    }
}