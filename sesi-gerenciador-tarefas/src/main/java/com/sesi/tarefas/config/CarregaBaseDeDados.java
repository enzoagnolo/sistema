package com.sesi.tarefas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sesi.tarefas.model.TarefaCategoria;
import com.sesi.tarefas.model.Usuario;
import com.sesi.tarefas.repository.TarefaCategoriaRepository;

@Configuration
public class CarregaBaseDeDados {

	@Autowired
	private TarefaCategoriaRepository tarefaCategoriaRepository;
	
		
	@Bean
	CommandLineRunner executar() {
		
		return args ->{
			
			Usuario usuario = new Usuario();
			usuario.setNome("Fernando");
			usuario.setNome("madu");
			
			Usuario usuario1 = new Usuario();
			usuario.setNome("Giovana");
			usuario.setNome("estudaMenina");
			
			
			TarefaCategoria categoria = new TarefaCategoria();
			categoria.setNome("Estudos");
			
			tarefaCategoriaRepository.save(categoria);
			
			
			TarefaCategoria categoria1 = new TarefaCategoria();
			categoria1.setNome("Pesquisa");
			tarefaCategoriaRepository.save(categoria1);
			
			
		};
		
	}
	
}
