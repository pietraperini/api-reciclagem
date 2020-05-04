package br.com.unip.apireciclagem.entity;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LIXO")
public class Lixo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lixo")
    private Long id;

    @Column(name = "nome_lixo", length = 40, nullable = false)
    private String nome;

    @Column(name = "tipo_lixo", nullable = false)
    private String tipo;

}
