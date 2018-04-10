package org.manning.sia.ch3.scopedbeans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type=FilterType.ANNOTATION, value=Configuration.class)})
public class ComponentScannedConfig {

}
