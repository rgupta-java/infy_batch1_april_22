package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = { "com.demo" })
public class MyAppConfig {

	@Bean(name = "passanger")
	public Passanger getPassanger(Vehical vehical) {
		Passanger passanger = new Passanger();
		passanger.setName("raj");
		passanger.setVehical(vehical);
		return passanger;
	}

	@Primary
	@Bean
	public Vehical getCar() {
		return new Car();
	}

	@Bean
	public Vehical getBike() {
		return new Bike();
	}
}
