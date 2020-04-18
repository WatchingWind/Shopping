package com.shop.web.config;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "picture")
@Setter
public class PicturePrefix {
    public static String prefix;
}
