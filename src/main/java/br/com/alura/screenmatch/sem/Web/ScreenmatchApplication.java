package br.com.alura.screenmatch.sem.Web;

import br.com.alura.screenmatch.sem.Web.model.DadosSerie;
import br.com.alura.screenmatch.sem.Web.service.ConsultaAPI;
import br.com.alura.screenmatch.sem.Web.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Primeiro projeto Spring sem Web.");
		var  consultaAPI = new ConsultaAPI();
		String endereco = "https://www.omdbapi.com/?apikey=e4b75cee&t=gilmore+girls?";
		var json = consultaAPI.obterDados(endereco);
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json,DadosSerie.class);
		System.out.println(dados);

	}
}
