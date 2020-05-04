package br.com.unip.apireciclagem.repository;
import br.com.unip.apireciclagem.entity.Lixo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LixoRepository extends JpaRepository<Lixo, Long> {
    @Query(value = "SELECT * FROM LIXO WHERE nome_lixo = :nomeLixo", nativeQuery = true)
    List<Lixo> findByNome(@Param("nomeLixo") String nomeLixo);
}
