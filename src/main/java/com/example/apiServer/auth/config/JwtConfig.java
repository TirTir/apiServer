package com.example.apiServer.auth.config;

import com.example.apiServer.auth.jwt.JwtProperties;
import com.example.apiServer.auth.jwt.TokenProvider;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(JwtProperties.class)
public class JwtConfig {
    @Bean
    public TokenProvider tokenProvider(JwtProperties jwtProperties) {
        String secret = jwtProperties.getSecret();
        System.out.println(secret);
        return new TokenProvider(jwtProperties.getSecret());
    }
}