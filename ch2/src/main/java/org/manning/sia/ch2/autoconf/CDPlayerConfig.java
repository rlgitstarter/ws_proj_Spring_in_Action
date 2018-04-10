package org.manning.sia.ch2.autoconf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Working together, component scanning and autowiring are a powerful force
// and can help keep explicit configuration to a minimum.
// Component scanning isn’t turned on by default, however. You’ll still need to write an explicit configuration
// to tell Spring to seek out classes annotated with @Component and to create beans from them.
// With no further configuration, @ComponentScan will default to scanning the same package as the configuration class.
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
