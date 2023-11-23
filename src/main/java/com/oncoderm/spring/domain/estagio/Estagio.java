package com.oncoderm.spring.domain.estagio;

import com.oncoderm.spring.domain.tipocancer.TipoCancer;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@Entity(name = "estagio")
@Table(name = "estagio")
public class Estagio {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seqestagio")
    @SequenceGenerator(name="seqestagio", sequenceName="estagio_seq",initialValue=11,allocationSize=1)
    private Integer id;

    private String nome;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "tipo_cancer_id")
    private TipoCancer tipoCancer;

    public Estagio(EstagioDTO data) {
        this.nome = data.nome();
        this.descricao = data.descricao();
        this.tipoCancer = data.tipoCancer();
    }

}
