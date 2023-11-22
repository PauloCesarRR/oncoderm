package com.oncoderm.spring.domain.prevencao;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "prevencao")
public class Prevencao {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seqprevencao")
    @SequenceGenerator(name="seqprevencao", sequenceName="prevencao_seq",initialValue=11,allocationSize=1)
    private Integer id;

    private String nome;

    public Prevencao(PrevencaoDTO data) {
        this.nome = data.nome();
    }

}
