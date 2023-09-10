package com.gcu;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	DataSource dataSource;

	
	/** 
	 * Uses the spring security framework to encode the password
	 * 
	 * @return PasswordEncoder returns an instance of BCryptPasswordEncoder
	 */
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	
	/** 
	 * Filters sites users can access and can't without authentication 
	 * 
	 * @param HttpSecurity allows for specific http request
	 * @return securityFilterChain returns an http.build object
	 */
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.httpBasic().and()
			.authorizeHttpRequests((requests) -> requests
				.requestMatchers("/", "/images/**", "/registration/**").permitAll()
				.anyRequest().authenticated()
			)
			.formLogin((form) -> form
				.loginPage("/login")
				.permitAll()
			)
			.logout((logout) -> logout.permitAll());

		return http.build();
	}
	
	/** 
	 * Filters sites users can access and can't without authentication 
	 * 
	 * @param DataSource Connection to sql database
	 * @param PasswordEncoder encoded password
	 * @return jdbcUserDetailsManager returns a new instance of jdbcUserDetailsManager so users can be updated/deleted
	 */
	@Bean
	public JdbcUserDetailsManager userDetailsService(DataSource dataSource, PasswordEncoder encoder) {
		// UserDetails user =
		// 	 User.builder()
		// 		.username("example@example.com") // hard-coded username
		// 		.password(encoder.encode("password123")) // hard-coded password
		// 		.roles("USER")
		// 		.build();
		
		JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
		// jdbcUserDetailsManager.createUser(user);
		return jdbcUserDetailsManager;
	}
}
