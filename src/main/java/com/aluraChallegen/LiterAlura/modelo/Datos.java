package com.aluraChallegen.LiterAlura.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;

public record Datos(
        @JsonAlias("count") Integer total,
        @JsonAlias("results") List<DatosLibros> libros) {
}