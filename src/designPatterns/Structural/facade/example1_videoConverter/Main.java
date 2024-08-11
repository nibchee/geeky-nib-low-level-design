package designPatterns.Structural.facade.example1_videoConverter;

import designPatterns.Structural.facade.example1_videoConverter.facade.VideoConversionFacade;

import java.io.File;

public class Main {
    VideoConversionFacade converter = new VideoConversionFacade();
    File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    // ...
}
