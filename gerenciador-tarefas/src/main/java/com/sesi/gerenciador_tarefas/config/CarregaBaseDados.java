package com.sesi.gerenciador_tarefas.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.sesi.gerenciador_tarefas.model.TarefaCategoria;

@Configuration
public class CarregaBaseDados {
	
	CommandLineRunner executar() {
		
		return args ->{
			TarefaCategoria categoria = new TarefaCategoria();
			categoria.setNome("Estudos");
			
			TarefaCategoria categoria1 = new TarefaCategoria();
			categoria.setNome("Pesquisa");
		};
	}
}
