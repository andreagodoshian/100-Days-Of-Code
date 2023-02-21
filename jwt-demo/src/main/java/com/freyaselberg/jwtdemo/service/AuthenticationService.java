package com.freyaselberg.jwtdemo.service;

import com.freyaselberg.jwtdemo.config.AuthenticationRequest;
import com.freyaselberg.jwtdemo.config.AuthenticationResponse;
import com.freyaselberg.jwtdemo.config.RegisterRequest;
import com.freyaselberg.jwtdemo.model.Role;
import com.freyaselberg.jwtdemo.model.User;
import com.freyaselberg.jwtdemo.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepo repo;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authManager;

    public AuthenticationResponse register (RegisterRequest request) {
        var user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
        repo.save(user);

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .jwt(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate (AuthenticationRequest request) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = repo.findByEmail(request.getEmail())
                .orElseThrow();

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .jwt(jwtToken)
                .build();
    }
}