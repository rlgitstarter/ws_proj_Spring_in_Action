package org.manning.sia.ch3.scopedbeans;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// Klasse fuer Tests mit ComponentScan
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ComponentScannedConfig.class)
public class ComponentScannedScopedBeanTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void testProtoScope() {
        Notepad notepad1 = context.getBean(Notepad.class);
        Notepad notepad2 = context.getBean(Notepad.class);
        Assert.assertNotSame(notepad1, notepad2);
    }

    @Test
    public void testSingletonScope() {
        UniqueThing thing1 = context.getBean(UniqueThing.class);
        UniqueThing thing2 = context.getBean(UniqueThing.class);
        Assert.assertSame(thing1, thing2);
    }
}
