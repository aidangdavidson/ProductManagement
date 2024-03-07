package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Task;

/**
 * @author aidan - agdavidson
 * CIS175 - Spring 2024
 * Mar 4, 2024
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Task task() {
		Task bean = new Task();
		return bean;
	}
}
