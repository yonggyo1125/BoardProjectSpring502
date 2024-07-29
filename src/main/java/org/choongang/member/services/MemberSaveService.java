package org.choongang.member.services;

import lombok.RequiredArgsConstructor;
import org.choongang.member.constants.Authority;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.entities.Member;
import org.choongang.member.repositories.AuthoritiesRepository;
import org.choongang.member.repositories.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberSaveService {
    private final MemberRepository memberRepository;
    private final AuthoritiesRepository authoritiesRepository;
    private final PasswordEncoder passwordEncoder;

    /**
     * 회원 가입 처리
     *
     * @param form
     */
    public void save(RequestJoin form) {
        Member member = new ModelMapper().map(form, Member.class);
        String hash = passwordEncoder.encode(form.getPassword()); // BCrypt 해시화
        member.setPassword(hash);

        save(member, List.of(Authority.USER));
    }


    public void save(Member member, List<Authority> authorities) {

    }
}
