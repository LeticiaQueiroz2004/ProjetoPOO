package br.senac.sp.series.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

// ORM - Mapeamento de Objeto Relacional (JPA - Java Persist )

@Entity
@Data
public class Serie {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank
    String NomeSerie;

    @NotBlank
    String Sinopse;

    @NotBlank
    String Diretor;

    @NotBlank
    String ElencoPrincipal;

    @NotBlank
    String Genero;
}
