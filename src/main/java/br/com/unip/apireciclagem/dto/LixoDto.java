package br.com.unip.apireciclagem.dto;

import br.com.unip.apireciclagem.entity.Lixo;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class LixoDto {
    private String nome;
    private String tipo;

    public static List<LixoDto> convert(List<Lixo> lixos) {
        return lixos.stream().map(LixoDto::new).collect(Collectors.toList());

    }

    public LixoDto(Lixo lixo){
        this.nome = lixo.getNome();
        this.tipo = lixo.getTipo();
    }

}
