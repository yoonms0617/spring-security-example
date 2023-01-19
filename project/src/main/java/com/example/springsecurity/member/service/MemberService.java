package com.example.springsecurity.member.service;

import com.example.springsecurity.member.domain.Member;
import com.example.springsecurity.member.dto.SignupRequest;
import com.example.springsecurity.member.exception.DuplicateEmailException;
import com.example.springsecurity.member.exception.NotFoundMemberException;
import com.example.springsecurity.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void signup(SignupRequest request) {
        if (isDuplicateEmail(request.getEmail())) {
            throw new DuplicateEmailException();
        }
        String encoded = ecryptionPassword(request.getPassword());
        Member member = Member.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(encoded)
                .build();
        memberRepository.save(member);
    }

    private boolean isDuplicateEmail(String email) {
        return memberRepository.existsByEmail(email);
    }

    private String ecryptionPassword(String rawPassword) {
        return passwordEncoder.encode(rawPassword);
    }

}
