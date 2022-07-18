package net.example.jwtappdemo.security.jwt;

import io.jsonwebtoken.Claims;
import net.example.jwtappdemo.model.Role;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JwtTokenProvider {

    @Value("${jwt.token.secret}")
    private String secret;
    @Value("${jwt.token.expired}")
    private long validityInMilliseconds;


    public String createToken(String username, List<Role> roles) {

    }

    public Authentication getAuthentication(String token) {

    }

    public String getUsername(String token){

    }

    public boolean validateToken(String token) {
        Claims
    }

    public List<String> getRoleNames(List<Role> userRoles) {
        List<String> result = new ArrayList<>();

        userRoles.forEach(role -> result.add(role.getName()));
        return result;
    }
}
