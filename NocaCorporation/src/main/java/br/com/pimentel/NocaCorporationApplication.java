package br.com.pimentel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import nz.net.ultraq.thymeleaf.decorators.strategies.GroupingStrategy;

@SpringBootApplication
public class NocaCorporationApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NocaCorporationApplication.class, args);
	}
	
	@Bean //Configura para uso de layout no thymeleaf, recurso foi retirado do Spring 2
	public LayoutDialect layoutDialect() {
	    return new LayoutDialect(new GroupingStrategy());
	}
	
}
