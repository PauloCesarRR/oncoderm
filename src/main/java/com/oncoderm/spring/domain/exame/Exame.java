package com.oncoderm.spring.domain.exame;

import com.oncoderm.spring.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@Entity(name = "exames")
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

    public Exame(ExameDTO data) {
        this.dataExame = data.dataExame();
        this.descricao = data.descricao();
        this.assimetrico = data.assimetrico();
        this.bordas = data.bordas();
        this.cor = data.cor();
        this.diametro = data.diametro();
        this.usuario = data.usuario();
    }

}
