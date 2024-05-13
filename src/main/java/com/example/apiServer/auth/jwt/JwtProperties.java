package com.example.apiServer.auth.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {
    private String header;
    private String issure;
    private String secret;
}