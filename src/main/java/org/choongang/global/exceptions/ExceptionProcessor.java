package org.choongang.global.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

public interface ExceptionProcessor {
    @ExceptionHandler(Exception.class)
    default ModelAndView errorHandler(Exception e, HttpServletRequest request) {

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; // 기본 응답 코드 500
        if (e instanceof CommonException commonException) {
            status = commonException.getStatus();
        }

        String url = request.getRequestURI();
        String qs = request.getQueryString();

        if (StringUtils.hasText(qs)) url += "?" + qs;

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", e.getMessage());
        mv.addObject("status", status.value());
        mv.addObject("method", request.getMethod());
        mv.addObject("path", url);
        mv.setStatus(status);
        mv.setViewName("error/error");


        return mv;
    }
}
