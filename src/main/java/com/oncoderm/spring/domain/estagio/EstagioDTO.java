package com.oncoderm.spring.domain.estagio;

import com.oncoderm.spring.domain.tipocancer.TipoCancer;

public record EstagioDTO(String nome, String descricao, TipoCancer tipoCancer) {
}
