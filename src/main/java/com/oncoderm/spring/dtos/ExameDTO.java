package com.oncoderm.spring.dtos;

import com.oncoderm.spring.domain.usuario.Usuario;

import java.time.LocalDate;

public record ExameDTO(LocalDate dataExame, String descricao, boolean assimetrico, String bordas, String cor, Float diametro, Usuario usuario) {
}
