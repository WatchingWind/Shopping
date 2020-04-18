package com.shop.web.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class JsonConfig {

  /**
   * 在一个HTTP交互中，Spring MVC（客户端和服务端）使用HttpMessageConverters协商内容转换。
   * 如果classpath下存在Jackson，你就已经获取到Jackson2ObjectMapperBuilder提供的默认转换器。
   *ref: https://doc.yonyoucloud.com/doc/Spring-Boot-Reference-Guide/IX.%20%E2%80%98How-to%E2%80%99%20guides/65.3.%20Customize%20the%20Jackson%20ObjectMapper.html
   */
  @Bean
  @ConditionalOnMissingBean
  public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
    ObjectMapper objectMapper = builder.createXmlMapper(false).build();
    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

    return objectMapper;
  }
}
