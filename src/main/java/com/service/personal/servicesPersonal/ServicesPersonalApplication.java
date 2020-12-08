package com.service.personal.servicesPersonal;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@SpringBootApplication
public class ServicesPersonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesPersonalApplication.class, args);
	}

	@Bean
	public LocaleResolver localeResolver(){
		AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
		Locale localeEs = new Locale("es");
		localeResolver.setDefaultLocale(localeEs);
		return localeResolver;
	}

}
