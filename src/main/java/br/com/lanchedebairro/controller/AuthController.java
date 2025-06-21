package br.com.lanchedebairro.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lanchedebairro.entities.TokenEntity;

@RestController
@RequestMapping("/v1/lanchedebairro/authentication")
public class AuthController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthController.class);

    @GetMapping
    @SuppressWarnings("null")
    ResponseEntity<TokenEntity> getAuthToken(@AuthenticationPrincipal Jwt jwt){
        LOGGER.info("token gerado {}", jwt.getExpiresAt().toEpochMilli());
        TokenEntity tokenEntity = new TokenEntity(jwt.getTokenValue(), jwt.getExpiresAt().toEpochMilli());
        return ResponseEntity.ok().body(tokenEntity);
    }

}
