package com.oncoderm.spring.domain.diagnostico;

import com.oncoderm.spring.domain.estagio.Estagio;
import com.oncoderm.spring.domain.tipocancer.TipoCancer;
import com.oncoderm.spring.domain.tipotratamento.TipoTratamento;
import com.oncoderm.spring.domain.exame.Exame;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@Entity(name = "diagnostico")
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

    public Diagnostico(DiagnosticoDTO data) {
        this.data = data.data();
        this.cancer = data.cancer();
        this.recomendacao = data.recomendacao();
        this.tipoCancer = data.tipoCancer();
        this.tipoTratamento = data.tipoTratamento();
        this.estagio = data.estagio();
        this.exame = data.exame();
    }
}
