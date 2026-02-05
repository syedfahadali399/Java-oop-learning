package labsession8.media;

public class Video implements Playable, Viewable {

    private String title;
    private double zoomLevel;

    public Video(String title) {
        this.title = title;
        this.zoomLevel = 1.0;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Pausing video: " + title);
    }

    @Override
    public void zoomIn() {
        zoomLevel *= 1.2;
        System.out.println("Zooming in video: " + title + " to level " + zoomLevel);
    }

    @Override
    public void zoomOut() {
        zoomLevel /= 1.2;
        System.out.println("Zooming out video: " + title + " to level " + zoomLevel);
    }

}
