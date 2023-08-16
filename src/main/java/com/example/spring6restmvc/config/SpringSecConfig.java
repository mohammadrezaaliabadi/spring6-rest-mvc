package com.example.spring6restmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SpringSecConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //http.csrf(csrf->csrf.ignoringRequestMatchers("/api/**"))

        http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(requests->requests.anyRequest().authenticated()).httpBasic(Customizer.withDefaults());
        return http.build();
    }

}
