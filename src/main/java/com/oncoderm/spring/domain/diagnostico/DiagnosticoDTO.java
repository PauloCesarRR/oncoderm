package com.oncoderm.spring.domain.diagnostico;

import com.oncoderm.spring.domain.estagio.Estagio;
import com.oncoderm.spring.domain.exame.Exame;
import com.oncoderm.spring.domain.tipocancer.TipoCancer;
import com.oncoderm.spring.domain.tipotratamento.TipoTratamento;

import java.time.LocalDate;

public record DiagnosticoDTO(LocalDate data, boolean cancer, String recomendacao, TipoCancer tipoCancer, TipoTratamento tipoTratamento, Estagio estagio, Exame exame) {
}
