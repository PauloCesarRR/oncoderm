package com.oncoderm.spring.domain.tipocancer;

import com.oncoderm.spring.domain.prevencao.Prevencao;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@Entity(name = "tipo_cancer")
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

    public TipoCancer(TipoCancerDTO data) {
        this.nome = data.nome();
        this.descricao = data.descricao();
        this.sintomaPrincipal = data.sintomaPrincipal();
        this.prevencao = data.prevencao();
        this.taxaMortalidade = data.taxaMortalidade();
    }

}
