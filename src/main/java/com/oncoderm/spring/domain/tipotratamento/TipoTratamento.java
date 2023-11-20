package com.oncoderm.spring.domain.tipotratamento;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_tratamento")
public class TipoTratamento {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seqtipotratamento")
    @SequenceGenerator(name="seqtipotratamento", sequenceName="tipo_tratamento_seq",initialValue=11,allocationSize=1)
    private Integer id;

    private String nome;

    private String descricao;

}
