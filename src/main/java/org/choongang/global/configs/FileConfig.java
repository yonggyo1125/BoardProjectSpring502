package org.choongang.global.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FileConfig implements WebMvcConfigurer {

    @Value("${file.upload.path}")
    private String path;

    @Value("${file.upload.url}")
    private String url;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }
}
