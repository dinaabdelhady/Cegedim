package com.cegedim.docMngSys.config;

import com.cegedim.docMngSys.model.Users;
import com.cegedim.docMngSys.services.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UserDao userDao;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {

        Users userdet = userDao.findByUserName("dina");
        UserDetails user = null;
        if(userdet != null) {
            user =
                    User.withDefaultPasswordEncoder()
                            .username(userdet.getUserName())
                            .password(userdet.getPassword())
                            .roles("USER")
                            .build();
        } else {
                user =
                        User.withDefaultPasswordEncoder()
                                .username("user")
                                .password("password")
                              .roles("USER")
                                .build();
        }


        return new InMemoryUserDetailsManager(user);
    }
}