package AbstractionTask;

class MediaPlayer{
    public void play(){
        System.out.println("Play Media");
    }
    public void pause(){
        System.out.println("Pause media");
    }
    public void stop(){
        System.out.println("Media Stopped");
    }
}

class VideoPlayer extends MediaPlayer implements Playlist{
    public void rewind(){
        System.out.println("Rewind Media");
    }
    public void fastForward(){
        System.out.println("Fast forward Media");
    }
    @Override
    public void addSong() {
        System.out.println("New Song Added!");
    }
    @Override
    public void removeSong() {
        System.out.println("Song Removed");
    }
}

interface Playlist{
    void addSong();
    void removeSong();
}

public class Task6 {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.addSong();
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();
        videoPlayer.removeSong();
    }
}
