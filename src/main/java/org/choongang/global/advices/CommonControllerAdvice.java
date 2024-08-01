package org.choongang.global.advices;

import lombok.RequiredArgsConstructor;
import org.choongang.member.MemberUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;

@RequiredArgsConstructor
@ControllerAdvice("org.choongang")
public class CommonControllerAdvice {

    private final MemberUtil memberUtil;
}
