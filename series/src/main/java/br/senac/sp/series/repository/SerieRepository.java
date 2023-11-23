package br.senac.sp.series.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.senac.sp.series.model.Serie;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    
}
