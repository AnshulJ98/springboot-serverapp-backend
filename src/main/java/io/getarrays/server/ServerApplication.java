package io.getarrays.server;

import io.getarrays.server.enumeration.Status;
import io.getarrays.server.model.Server;
import io.getarrays.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save( new Server(null, "192.168.1.160", "Ubuntu", "16 GB", "Dev Machine", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save( new Server(null, "192.168.1.60", "Fedora", "32 GB", "Dell", "http://localhost:8080/server/image/server2.png", Status.SERVER_UP));
			serverRepo.save( new Server(null, "192.168.1.16", "Debian", "16 GB", "School PC", "http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
			serverRepo.save( new Server(null, "192.168.1.6", "Arch", "24 GB", "Personal PC", "http://localhost:8080/server/image/server4.png", Status.SERVER_UP));
			serverRepo.save( new Server(null, "192.168.0.195", "MS Server", "64 GB", "Enterprise Server", "http://localhost:8080/server/image/server5.png", Status.SERVER_UP));

		};
	}

}
