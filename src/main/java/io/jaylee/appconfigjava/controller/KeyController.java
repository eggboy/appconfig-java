package io.jaylee.appconfigjava.controller;

import com.azure.spring.cloud.config.AppConfigurationRefresh;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class KeyController {
    @Value("${key1}")
    String key1;

    @GetMapping
    public String getMessage() {
        return key1;
    }
}
