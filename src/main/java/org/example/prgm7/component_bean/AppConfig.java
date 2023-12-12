package org.example.prgm7.component_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        return new Student();
    }

    // Other beans or configurations can be added here if needed
}
