package org.manning.sia.ch1;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    // Constructor
    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    // Impl.
    public void embark() {
        // TODO Auto-generated method stub
        stream.println("Embarking on quest to slay the dragon!");
    }

}
