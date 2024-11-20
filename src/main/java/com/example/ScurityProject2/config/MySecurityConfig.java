package com.example.ScurityProject2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity

public class MySecurityConfig extends WebSecurityConfiguration {

    protected  void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().withUser("karan").password("karan").roles("Normal");
        auth.inMemoryAuthentication().withUser("pooja").password("pooja").roles("Admin");

    }


    @Bean
public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();

}




}
