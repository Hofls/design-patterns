package com.github.hofls.designpatterns.creational.factory_method;

/**
 * Builder lets you construct complex objects step by step
 * Pattern is similar to Abstract Factory, but without emphasis on families of objects
 * Recognizeable by creational methods returning an implementation of an abstract/interface type
 */
public class Main {

    public void onStartup() {
        String imageFormat = ".png";
        String encodedImage = "S8LJS82JRJ8D";
        decodeImage(imageFormat, encodedImage);
    }

    private FactoryMethod.DecodedImage decodeImage(String imageFormat, String encodedImage) {
        FactoryMethod.DecodedImage decodedImage = null;
        if (imageFormat.equals(".png")) {
            decodedImage = new FactoryMethod.PngReader().decodeImage(encodedImage);
        } else if (imageFormat.equals(".svg")) {
            decodedImage = new FactoryMethod.SvgReader().decodeImage(encodedImage);
        }
        return decodedImage;
    }



}
