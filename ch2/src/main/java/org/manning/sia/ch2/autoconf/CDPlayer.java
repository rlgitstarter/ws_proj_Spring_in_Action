package org.manning.sia.ch2.autoconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component: This simple annotation identifies this class as a component class and serves as a clue to Spring
// that a bean should be created for the class. There’s no need to explicitly configure a CDPlayer bean.
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    // Constructor, annotated with @Autowired, indicating that when Spring creates the CDPlayer bean, it should
    // instantiate it via that constructor and pass in a bean that is assignable to CompactDisc.
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    // Impl.
    public void play() {
        cd.play();
    }
}
