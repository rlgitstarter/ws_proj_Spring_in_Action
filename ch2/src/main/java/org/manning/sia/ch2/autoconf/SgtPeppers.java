package org.manning.sia.ch2.autoconf;

import org.springframework.stereotype.Component;

// @Component: This simple annotation identifies this class as a component class and serves as a clue to Spring
// that a bean should be created for the class. There’s no need to explicitly configure a SgtPeppers bean.
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
