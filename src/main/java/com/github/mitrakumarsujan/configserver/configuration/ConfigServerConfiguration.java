package com.github.mitrakumarsujan.configserver.configuration;

import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigServer
public class ConfigServerConfiguration {
}
