package br.com.fiap.banconacional.model.dto;

public record Token(
    String token,
    String type,
    String prefix
) {} 
