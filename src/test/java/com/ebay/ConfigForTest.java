package com.ebay;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.ActiveProfiles;

/**
 * Created by Evegeny on 27/11/2016.
 */
@Configuration
@ComponentScan(basePackages = "com.ebay.profiles.example")
@EnableMongoRepositories(basePackages = "com.ebay.profiles.example")
@SpringBootApplication
@ActiveProfiles("")
public class ConfigForTest {
}
