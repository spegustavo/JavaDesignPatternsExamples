package pattern.facade.client;

import java.io.File;

import pattern.facade.VideoConversionFacade;

public class ClientFacade {
	public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        
        System.out.println("----------------------------------------");
        
        VideoConversionFacade converter1 = new VideoConversionFacade();
        File mp4Video1 = converter1.convertVideo("youtubevideo.ogg", "dvix");
        
    }
}
