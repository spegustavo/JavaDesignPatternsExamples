package pattern.facade;

import java.io.File;

import pattern.facade.codec.AudioMixer;
import pattern.facade.codec.BitrateReader;
import pattern.facade.codec.Codec;
import pattern.facade.codec.CodecFactory;
import pattern.facade.codec.MPEG4CompressionCodec;
import pattern.facade.codec.OggCompressionCodec;
import pattern.facade.codec.VideoFile;

/*
 * The Facade pattern is commonly used in apps written in Java. It’s especially handy 
 * when working with complex libraries and APIs.
 * 
 * */

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
		VideoFile buffer = BitrateReader.read(file, sourceCodec);
		VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
		File result = (new AudioMixer()).fix(intermediateResult);
		System.out.println("VideoConversionFacade: conversion completed.");
		return result;
	}
}
