package br.com.baldereducation.sitecore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/app/**").permitAll()
		.anyRequest().authenticated().and();
		http.httpBasic();
		//http.authorizeRequests().anyRequest().fullyAuthenticated().and().antMatcher("/app/**").permitAll().and().httpBasic().and().csrf().disable();
	}

}