package br.com.unip.apireciclagem.controller;
import br.com.unip.apireciclagem.dto.LixoDto;
import br.com.unip.apireciclagem.entity.Lixo;
import br.com.unip.apireciclagem.repository.LixoRepository;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


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

    //@GetMapping("{id}")
    //@Transactional(readOnly = true)
    //public LixoDto findById(@PathVariable Long id) {
    //    return lixoRepository.findById(id)
    //            .map(LixoDto::new)
    //            .orElseThrow(NotFoundException::new);
    //}

}

