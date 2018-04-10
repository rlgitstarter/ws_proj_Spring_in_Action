package org.manning.sia.ch2.javaconf;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.manning.sia.ch2.autoconf.CDPlayerConfig;
import org.manning.sia.ch2.autoconf.CompactDisc;
import org.manning.sia.ch2.autoconf.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    // Dependency Injections: annotated with @Autowired to inject the CompactDisc bean and the
    // MediaPlayer bean into the test.
    @Autowired
    private MediaPlayer player;

    // auch bei expliziter Java-Conf wird in der Testklasse @AutWired benötigt (getestet) ...
    @Autowired
    private CompactDisc cd;

    // JUnit Tests
    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
                log.getLog());
    }
}
