package br.com.alura.screenmatch.sem.Web.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//ignorar as outras informacoes
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTempoeadas,
                         @JsonAlias("imdbRating") String avaliacao) {

}
