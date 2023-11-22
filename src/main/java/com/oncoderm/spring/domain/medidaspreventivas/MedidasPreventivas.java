package com.oncoderm.spring.domain.medidaspreventivas;

import com.oncoderm.spring.domain.prevencao.Prevencao;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "medidas_preventivas")
public class MedidasPreventivas {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seqmedidaspreventivas")
    @SequenceGenerator(name="seqmedidaspreventivas", sequenceName="medidas_preventivas_seq",initialValue=11,allocationSize=1)
    private Integer id;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "prevencao_id")
    private Prevencao prevencao;

    public MedidasPreventivas(MedidasPreventivasDTO data){
        this.descricao = data.descricao();
        this.prevencao = data.prevencao();
    }

}
