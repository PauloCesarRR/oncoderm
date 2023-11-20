package com.oncoderm.spring.domain.diagnostico;

import com.oncoderm.spring.domain.estagio.Estagio;
import com.oncoderm.spring.domain.tipocancer.TipoCancer;
import com.oncoderm.spring.domain.tipotratamento.TipoTratamento;
import com.oncoderm.spring.domain.exame.Exame;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "diagnostico")
public class Diagnostico {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seqdiagnostico")
    @SequenceGenerator(name="seqdiagnostico", sequenceName="diagnostico_seq",initialValue=11,allocationSize=1)
    private Integer id;

    private LocalDate data;

    @Column(name = "e_cancer")
    private boolean cancer;

    private String recomendacao;

    @ManyToOne
    @JoinColumn(name = "tipo_cancer_id")
    private TipoCancer tipoCancer;

    @ManyToOne
    @JoinColumn(name = "tipo_tratamento_id")
    private TipoTratamento tipoTratamento;

    @ManyToOne
    @JoinColumn(name = "estagio_id")
    private Estagio estagio;

    @ManyToOne
    @JoinColumn(name = "exame_id")
    private Exame exame;

}
