package labsession8.media;

public class Audio implements Playable {

    private String title;
    private String artist;

    public Audio(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing audio: " + title + " by " + artist);
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio: " + title);
    }

}
