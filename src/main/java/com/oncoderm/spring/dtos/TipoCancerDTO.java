package com.oncoderm.spring.dtos;

import com.oncoderm.spring.domain.prevencao.Prevencao;

public record TipoCancerDTO(String nome, String descricao, String sintomaPrincipal, Prevencao prevencao, Float taxaMortalidade) {
}
