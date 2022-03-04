package net.javaguides.springbootbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import net.javaguides.springbootbackend.model.User;
import net.javaguides.springbootbackend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository UserRepository;

	@Override
	public void run(String... args) throws Exception {
		this.UserRepository.save(new User("Peter", "Griffith", "PGriffith@gmail.com"));
		this.UserRepository.save(new User("Lois", "Griffith", "LGriffith@gmail.com"));
		this.UserRepository.save(new User("Stewie", "Griffith", "SGriffith@gmail.com"));
	}

}
