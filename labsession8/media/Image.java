package labsession8.media;

public class Image implements Playable, Viewable {

    private String title;
    private String photographer;
    private double zoomLevel;

    public Image(String title, String photographer) {
        this.title = title;
        this.photographer = photographer;
        this.zoomLevel = 1.0;
    }

    @Override
    public void play() {
        System.out.println("Displaying image: " + title + " by " + photographer);
    }

    @Override
    public void pause() {
        System.out.println("Pausing display of image: " + title);
    }

    @Override
    public void zoomIn() {
        zoomLevel *= 1.2;
        System.out.println("Zooming in image: " + title + " to level " + zoomLevel);
    }

    @Override
    public void zoomOut() {
        zoomLevel /= 1.2;
        System.out.println("Zooming out image: " + title + " to level " + zoomLevel);
    }

}
