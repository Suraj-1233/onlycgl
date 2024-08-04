package com.jwt.example.JwtExample.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor

@Builder
@ToString

public class JwtResponse {
    private final String jwtToken;
    private final String username;



}
