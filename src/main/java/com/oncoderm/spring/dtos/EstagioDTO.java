package com.oncoderm.spring.dtos;

import com.oncoderm.spring.domain.tipocancer.TipoCancer;

public record EstagioDTO(String nome, String descricao, TipoCancer tipoCancer) {
}
