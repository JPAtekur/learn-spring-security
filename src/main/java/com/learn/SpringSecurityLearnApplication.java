package com.learn;

import com.learn.model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityLearnApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityLearnApplication.class, args);
	}

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private AppUserRepo appUserRepo;

	@Override
	public void run(String... args) throws Exception {
		AppUser appUser = new AppUser();
		appUser.setRole("ROLE_ADMIN");
		appUser.setUsername("nirob");
		appUser.setEmail("nirob@gmail.com");
		appUser.setPassword(passwordEncoder.encode("123"));

		appUserRepo.save(appUser);

		AppUser appUser1 = new AppUser();
		appUser1.setRole("ROLE_NORMAL");
		appUser1.setUsername("shakila");
		appUser1.setEmail("shakila@gmail.com");
		appUser1.setPassword(passwordEncoder.encode("456"));

		appUserRepo.save(appUser1);
	}
}
