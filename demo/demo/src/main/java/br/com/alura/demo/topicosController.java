package br.com.alura.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.demo.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class topicosController {
 
	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {
	 Topico topico = new Topico("Duvida", "Duvida com SpringTeste", new Curso("Spring", "progamação"));
	 
	 return TopicoDto.converter(Arrays.asList(topico, topico, topico));
 }
}
