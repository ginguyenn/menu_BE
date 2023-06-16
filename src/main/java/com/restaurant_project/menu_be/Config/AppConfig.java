package com.restaurant_project.menu_be.Config;

import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.restaurant_project.menu_be.Persistence")

public class AppConfig {

}
