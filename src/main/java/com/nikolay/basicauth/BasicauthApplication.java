package com.nikolay.basicauth;

import com.nikolay.basicauth.appuser.AppUser;
import com.nikolay.basicauth.appuser.AppUserRepository;
import com.nikolay.basicauth.appuser.AppUserRole;
import com.nikolay.basicauth.footballer.Footballer;
import com.nikolay.basicauth.footballer.FootballerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BasicauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicauthApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(
			FootballerRepository footballerRepository,
			AppUserRepository appUserRepository
	) {
		return args -> {
			footballerRepository.save(new Footballer("Jack", "Grealish"));
			footballerRepository.save(new Footballer("Kevin", "De Bruyne"));
			footballerRepository.save(new Footballer("Erling", "Haaland"));
			footballerRepository.save(new Footballer("John", "Stones"));

			BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
			String encodedPassword = bCryptPasswordEncoder.encode("barca_best_club");
			AppUser admin = new AppUser("Guardiola", encodedPassword, AppUserRole.ADMIN);
			appUserRepository.save(admin);
		};
	}
}
