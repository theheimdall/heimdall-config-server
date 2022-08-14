package org.theheimdall.heimdallconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HeimdallConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeimdallConfigServerApplication.class, args);
	}

}
