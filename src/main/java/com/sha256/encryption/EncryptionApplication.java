package com.sha256.encryption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"endpoints"})
public class EncryptionApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EncryptionApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(EncryptionApplication.class, args);
    }

}
