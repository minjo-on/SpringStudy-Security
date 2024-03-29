package com.example.springstudysecurity.security.common;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.authentication.WebAuthenticationDetails;


public class FormWebAuthenticationDetails extends WebAuthenticationDetails {
    private String secretKey;

    public String getSecretKey() {
        return secretKey;
    }

    public FormWebAuthenticationDetails(HttpServletRequest request) {
        super(request);
        secretKey= request.getParameter("secret_key");
    }
}
