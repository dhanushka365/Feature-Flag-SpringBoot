package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.spi.FeatureProvider;
import org.togglz.core.user.NoOpUserProvider;

@Configuration
public class TogglzConfig {
    @Bean
    public FeatureProvider featureProvider() {
        return new EnumBasedFeatureProvider(FeatureFlags.class);
    }

    @Bean
    public NoOpUserProvider userProvider() {
        return new NoOpUserProvider();
    }
}
