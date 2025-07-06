package com.abc.test;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.abc.test.Racun;
import com.abc.test.RacunRepository;

@SpringBootApplication
public class Test2Application {

	public static void main(String[] args) {
		SpringApplication.run(Test2Application.class, args);
	}
	
	@Bean
	CommandLineRunner initLoad(RacunRepository repository)  {
		return (args) ->  {
			repository.save(new Racun("HR3455345442", 1, "USD", 1, LocalDate.of(2012, 12, 21), LocalDate.of(2020, 3, 16)));
			repository.save(new Racun("DE3232366551", 1, "EUR", 2, LocalDate.of(2001, 6, 15), null));
			repository.save(new Racun("HR2134666632", 2, "EUR", 1, LocalDate.of(2020, 3, 17), null));
		};
	}

}
