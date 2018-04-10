package org.manning.sia.ch3.externals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EnvironmentConfig.class)
public class InjectFromPropertiesTest {

    @Autowired
    private BlankDisc blankDisc;

    @Test
    public void assertBlankDiscProperties() {
        Assert.assertEquals("The Beatles", blankDisc.getArtist());
        Assert.assertEquals("Sgt. Peppers Lonely Hearts Club Band", blankDisc.getTitle());
    }
}
