package io.jaylee.appconfigjava;

import com.azure.spring.cloud.config.AppConfigurationBootstrapConfiguration;
import com.azure.spring.cloud.config.properties.AppConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bootstrap.config.PropertySourceBootstrapConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class AppconfigJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppconfigJavaApplication.class, args);
	}

}
