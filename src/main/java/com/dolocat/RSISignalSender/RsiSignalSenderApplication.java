package com.dolocat.RSISignalSender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class RsiSignalSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsiSignalSenderApplication.class, args);
	}

}
