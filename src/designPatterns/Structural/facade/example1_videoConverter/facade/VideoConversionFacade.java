package designPatterns.Structural.facade.example1_videoConverter.facade;

import designPatterns.Structural.facade.example1_videoConverter.some_complex_media_library.*;

import java.io.File;

import static designPatterns.Structural.facade.example1_videoConverter.some_complex_media_library.BitrateReader.*;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = read(file, sourceCodec);
        VideoFile intermediateResult = convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
