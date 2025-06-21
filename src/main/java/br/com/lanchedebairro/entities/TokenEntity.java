package br.com.lanchedebairro.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TokenEntity(@JsonProperty("access_token") String token, long exp) {
}
