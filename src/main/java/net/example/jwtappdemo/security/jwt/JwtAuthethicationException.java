package net.example.jwtappdemo.security.jwt;

import org.springframework.security.core.AuthenticationException;

public class JwtAuthethicationException extends AuthenticationException {
    public JwtAuthethicationException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public JwtAuthethicationException(String msg) {
        super(msg);
    }
}
