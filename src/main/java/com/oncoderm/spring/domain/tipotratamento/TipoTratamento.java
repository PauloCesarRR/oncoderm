package com.oncoderm.spring.domain.tipotratamento;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@Entity(name = "tipo_tratamento")
@Table(name = "tipo_tratamento")
public class TipoTratamento {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seqtipotratamento")
    @SequenceGenerator(name="seqtipotratamento", sequenceName="tipo_tratamento_seq",initialValue=11,allocationSize=1)
    private Integer id;

    private String nome;

    private String descricao;

    public TipoTratamento(TipoTratamentoDTO data) {
        this.nome = data.nome();
        this.descricao = data.descricao();
    }



}
