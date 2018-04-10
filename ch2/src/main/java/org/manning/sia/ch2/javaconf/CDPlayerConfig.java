package org.manning.sia.ch2.javaconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// in this case, no @ComponentScan, so the beans must be explicitly configured with @Bean
@Configuration
public class CDPlayerConfig {

    // The JUnit test expects to be injected with CDPlayer and CompactDisc
    // To declare a bean in JavaConfig, you write a method that creates an instance of the desired type
    // and annotate it with @Bean.
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
