package org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication(exclude = { JpaRepositoriesAutoConfiguration.class })
@EnableFeignClients
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args)
    {
        logger.info("******************Starting NSSF API********************");

        SpringApplication.run(Application.class, args);
    }

}