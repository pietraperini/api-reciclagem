package br.com.unip.apireciclagem.form;

import br.com.unip.apireciclagem.entity.Lixo;
import br.com.unip.apireciclagem.repository.LixoRepository;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LixoForm {

    @NotBlank
    @Size(max = 100)
    private String nome;

    @NotBlank
    private String tipo;

    public Lixo toModel(LixoRepository lixoRepository) {
        return Lixo.builder()
                .nome(this.nome)
                .tipo(this.tipo)
                .build();
    }
}
