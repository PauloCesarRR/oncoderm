package com.oncoderm.spring.domain.exame;

import com.oncoderm.spring.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "exames")
public class Exame {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seqexame")
    @SequenceGenerator(name="seqexame", sequenceName="exames_seq",initialValue=11,allocationSize=1)
    private Integer id;

    @Column(name = "data_exame")
    private LocalDate dataExame;

    private String descricao;

    private boolean assimetrico;

    private String bordas;

    private String cor;

    @Column(name = "diametro_mm")
    private Float diametro;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
