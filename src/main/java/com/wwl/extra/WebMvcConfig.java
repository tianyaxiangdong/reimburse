package com.wwl.extra;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by cactus on 2015/11/21.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/META-INF/resources/", "classpath:/resources/",
            "classpath:/static/", "classpath:/public/"};

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String[] handlers = {"/js/**", "/css/**"};
        String[] locations = {"/WEB-INF/views/", "/WEB-INF/views/"};
        registry.addResourceHandler(handlers).addResourceLocations(locations);
    }
}
