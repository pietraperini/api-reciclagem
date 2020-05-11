package br.com.unip.apireciclagem.controller;
import br.com.unip.apireciclagem.dto.LixoDto;
import br.com.unip.apireciclagem.entity.Lixo;
import br.com.unip.apireciclagem.form.LixoForm;
import br.com.unip.apireciclagem.repository.LixoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/")
public class LixoController {

    @Autowired
    private LixoRepository lixoRepository;

    @GetMapping
    @Transactional(readOnly = true)
    public List<LixoDto> lista(String nomeLixo){
            List<Lixo> lixos = lixoRepository.findAll();
            return LixoDto.convert(lixos);
    }

    @GetMapping("{nome}")
    @Transactional(readOnly = true)
    public List<LixoDto> findById(@PathVariable String nome) {
        List<Lixo> lixos = lixoRepository.findByNome(nome);
        return LixoDto.convert(lixos);
    }

    //@PostMapping
    //@ResponseStatus(HttpStatus.CREATED)
    //public LixoDto save(@RequestBody @Valid LixoForm form){
    //    var lixo = lixoRepository.save(form.toModel(lixoRepository));
    //    return new LixoDto(lixo);
    //}

}

