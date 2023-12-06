package com.pruebatecnica.www.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.pruebatecnica.www.jwt.JWTAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class InvestigadoresSecurityConfig {

	private static final String[] SECURED_URLs = { "/api/message/**","/api/belongs/**","/api/partys**","/api/users/**", };

	private static final String[] UN_SECURED_URLs = { "/login/**" };

	@Autowired
	private JWTAuthenticationFilter authenticationFilter;

	@Autowired
	private InvestigadoresUserDetailsService userDetailsService;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationProvider authenticationProvider() {
		var authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userDetailsService);
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		return authenticationProvider;
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf().disable()
				.authorizeHttpRequests(auth -> auth.requestMatchers(UN_SECURED_URLs).permitAll()
						.requestMatchers(SECURED_URLs)
						.hasAnyAuthority("ADMIN", "USER").anyRequest().authenticated())
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
				.authenticationProvider(authenticationProvider())
				.addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class).build();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
		return authConfig.getAuthenticationManager();
	}

}

//http.csrf().disable()
//.authorizeHttpRequests()
//.requestMatchers(UN_SECURED_URLs).permitAll().and()
//.authorizeHttpRequests().requestMatchers(SECURED_URLs)
//.hasAuthority("ADMIN").anyRequest().authenticated()
//.and().sessionManagement()
//.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//.and()
//.authenticationProvider(authenticationProvider())
//.addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class)
//.build();

//http.csrf().disable()
//.authorizeHttpRequests(
//		auth -> auth
//		.requestMatchers(UN_SECURED_URLs).permitAll()
//		.requestMatchers(user_unsecured_urls).hasAuthority("USER")
//		.requestMatchers(SECURED_URLs).hasAuthority("ADMIN")
//		.anyRequest().authenticated())
//.sessionManagement()
//.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//.and()
//.authenticationProvider(authenticationProvider())
//.addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class)
//.build();