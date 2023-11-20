package com.oncoderm.spring.domain.tipocancer;

import com.oncoderm.spring.domain.prevencao.Prevencao;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_cancer")
public class TipoCancer {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seqtipocancer")
    @SequenceGenerator(name="seqtipocancer", sequenceName="tipo_cancer_seq",initialValue=11,allocationSize=1)
    private Integer id;

    private String nome;

    private String descricao;

    @Column(name = "sintoma_principal")
    private String sintomaPrincipal;

    @ManyToOne
    @JoinColumn(name = "prevencao_id")
    private Prevencao prevencao;

    @Column(name = "taxa_mortalidade")
    private Float taxaMortalidade;

}
