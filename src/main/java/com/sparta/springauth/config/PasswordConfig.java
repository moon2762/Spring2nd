package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig { // paswordconfig

    // 기술적인 문제나 공통적인 관심사를 처리할때 사용하는 객체를 수동으로 bean등록하는게 좋다 (기술지원 bean)

    @Bean
    public PasswordEncoder passwordEncoder() { // bean으로 등록하는 메서드를 반환하는 메서드
        return new BCryptPasswordEncoder(); // BCrypt는 비밀번호를 암호화 해주는 hash 함수

    }


}