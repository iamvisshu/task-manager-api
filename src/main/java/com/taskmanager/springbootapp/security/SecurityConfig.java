package com.taskmanager.springbootapp.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Allow access to H2 console
        http.authorizeRequests()
                .antMatchers("/h2-console/**").permitAll();

        // Permit access to your API endpoints and enable CORS
        http.authorizeRequests()
                .antMatchers("/tasks/**").permitAll() // Permit access to all endpoints under /tasks
                .anyRequest().authenticated(); // Require authentication for any other requests

        // Disable CSRF and frame options for H2 console
        http.csrf().disable();
        http.headers().frameOptions().disable();

        // Enable CORS (Cross-Origin Resource Sharing)
        http.cors(); // Add this line to enable CORS globally
    }
}
