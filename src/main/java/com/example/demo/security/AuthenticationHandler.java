package com.example.demo.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.example.demo.constant.Roles;
import com.example.demo.repository.ContactRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@Component
public class AuthenticationHandler implements AuthenticationSuccessHandler {

    @Autowired
    HttpSession session;

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse,
                                        Authentication authentication) throws IOException {

        httpServletResponse.setStatus(HttpServletResponse.SC_OK);

        String page = "";

        for (GrantedAuthority auth : authentication.getAuthorities()) {
            if (Roles.SUPER_ADMIN.equals(auth.getAuthority())) {
                // TODO Define Page for Super Admin
                page = "/contacts";
            }else if (Roles.ADMIN.equals(auth.getAuthority())) {
                // TODO Define Page for Admin
                page = "/contacts";
            }else if (Roles.USER.equals(auth.getAuthority())) {
                // TODO Define Page for User
                page = "/contacts";
            }
        }

        httpServletResponse.sendRedirect(page);
    }
}
