package com.example.WelcomCiCD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class WelcomCiCdApplication {

//	echo "# cicd" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/anish124/cicd.git
//	git push -u origin main
//git config --global user.email "anish.g.reddy@gmail.com"
	@GetMapping("/welcome")
	public String welcome(){

		return "welcome to ci/cd";
	}

	public static void main(String[] args) {
		SpringApplication.run(WelcomCiCdApplication.class, args);
	}

}
