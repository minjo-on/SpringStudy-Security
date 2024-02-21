//package com.example.springstudysecurity.jwtConfig;
//
//import com.example.springstudysecurity.jwt.JWTFilter;
//import com.example.springstudysecurity.jwt.JWTUtil;
//import com.example.springstudysecurity.jwt.LoginFilter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
////@Configuration
////@EnableWebSecurity
//public class JwtSecurityConfig {
//
//    private final JWTUtil jwtUtil;
//    private final AuthenticationConfiguration authenticationConfiguration;
//
//    public JwtSecurityConfig(AuthenticationConfiguration authenticationConfiguration, JWTUtil jwtUtil){
//        this.authenticationConfiguration = authenticationConfiguration;
//        this.jwtUtil = jwtUtil;
//    }
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
//        return configuration.getAuthenticationManager();
//    }
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        http
//                .csrf((auth) -> auth.disable());
//
//        http
//                .formLogin((auth) -> auth.disable());
//
//        http
//                .httpBasic((auth) -> auth.disable());
//
//        http
//                .authorizeHttpRequests((auth) -> auth
//                        .requestMatchers("/jwt/login", "/jwt", "/jwt/join","/oauth2/**").permitAll()
//                        .requestMatchers("/jwt/admin/**").hasRole("ADMIN")
//                        .anyRequest().authenticated());
///*
//        http
//                .oauth2Login(Customizer.withDefaults());
//*/
//
//        //JWTFilter 등록
//
//        http
//                .addFilterBefore(new JWTFilter(jwtUtil), LoginFilter.class);
//        http
//                .addFilterAt(new LoginFilter(authenticationManager(authenticationConfiguration),jwtUtil), UsernamePasswordAuthenticationFilter.class);
//        http
//                .sessionManagement((session) -> session
//                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//
//        return http.build();
//    }
//}
