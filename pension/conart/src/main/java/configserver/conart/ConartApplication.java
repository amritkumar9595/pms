package configserver.conart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.CrossOrigin;
@EnableConfigServer
@SpringBootApplication
public class ConartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConartApplication.class, args);
	}

}
