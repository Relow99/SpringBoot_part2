package com.springboot.SpringBoot_1;

import Service.FakeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringBoot1Application.class, args);

		FakeRepo fakerepo = new FakeRepo();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String id = reader.readLine();
		String name = reader.readLine() ;
		String surname = reader.readLine();
		long NewID = Long.parseLong(id);
		fakerepo.insertUser(NewID,name,surname);

	}

}
