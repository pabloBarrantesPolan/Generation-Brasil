package org.generation.brazil.gfood.security;

import lombok.Data;

@Data
public class JwtAuthenticationRequest {

    private String userName;
    private String password;



}
