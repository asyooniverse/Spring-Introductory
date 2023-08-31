package com.example.springproject;

import com.example.springproject.repository.MemberRepository;
import com.example.springproject.repository.MemoryMemberRepository;
import com.example.springproject.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
