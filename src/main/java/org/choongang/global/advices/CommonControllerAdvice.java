package org.choongang.global.advices;

import lombok.RequiredArgsConstructor;
import org.choongang.member.MemberUtil;
import org.choongang.member.entities.Member;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@RequiredArgsConstructor
@ControllerAdvice("org.choongang")
public class CommonControllerAdvice {

    private final MemberUtil memberUtil;

    @ModelAttribute("loggedMember")
    public Member loggedMember() {
        return memberUtil.getMember();
    }

    @ModelAttribute("isLogin")
    public boolean isLogin() {
        return memberUtil.isLogin();
    }

    @ModelAttribute("isAdmin")
    public boolean isAdmin() {
        return memberUtil.isAdmin();
    }
}
