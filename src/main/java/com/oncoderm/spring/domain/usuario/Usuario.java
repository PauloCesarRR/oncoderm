package com.oncoderm.spring.domain.usuario;

import com.oncoderm.spring.dtos.UsuarioDTO;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@Entity(name = "usuarios")
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="sequsuario")
    @SequenceGenerator(name="sequsuario", sequenceName="usuarios_seq",initialValue=11,allocationSize=1)
    private Integer id;
    private String nome;
    private String email;
    private String senha;

    public Usuario(UsuarioDTO data){
        this.nome = data.nome();
        this.email = data.email();
        this.senha = data.senha();
    }

}
