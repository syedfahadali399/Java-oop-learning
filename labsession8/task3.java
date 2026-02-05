package labsession8;

import labsession8.media.Audio;
import labsession8.media.Video;
import labsession8.media.Image;


public class task3 {
    public static void main(String[] args) {
        Audio audio = new Audio("Song Title", "Artist Name");
        Video video = new Video("Movie Title");
        Image image = new Image("Photo Title", "Photographer Name");

        audio.play();
        audio.pause();
        
        System.out.println();
        video.play();
        video.pause();
        
        System.out.println();
        image.play();
        image.pause();
        
        System.out.println();
        video.zoomIn();
        video.zoomOut();
        
        System.out.println();
        image.zoomIn();
        image.zoomOut();
    }
}
