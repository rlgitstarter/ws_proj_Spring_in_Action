package org.manning.sia.ch3.externals;

import org.springframework.beans.factory.annotation.Value;

public class BlankDisc {

    private final String title;
    private final String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
