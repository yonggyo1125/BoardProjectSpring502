package org.choongang.member.services;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.choongang.member.controllers.RequestLogin;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import java.io.IOException;

public class LoginFailureHandler implements AuthenticationFailureHandler {
    @Override
    // 로그인 실패시에 유입되는 메서드
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

        HttpSession session = request.getSession();

        RequestLogin form = new RequestLogin();
        form.setEmail(request.getParameter("email"));
        form.setPassword(request.getParameter("password"));


        form.setSuccess(false);
        session.setAttribute("requestLogin", form);

        // 로그인 실패시 로그인 페이지 이동
        response.sendRedirect(request.getContextPath() + "/member/login");
    }
}
