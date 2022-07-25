package br.com.alura.demo.dto;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {
		public static Object converter;
		private Long idLong;
		private String titulo;
		private String mensagem;
		private LocalDateTime dataCriacao;
		
		public TopicoDto(Topico topico) {
			this.idLong = topico.getId();
			this.titulo = topico.getTitulo();
			this.mensagem = topico.getMensagem();
			this.dataCriacao = topico.getDataCriacao();}
		
		public Long getIdLong() {
			return idLong;
		}
		public void setIdLong(Long idLong) {
			this.idLong = idLong;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getMensagem() {
			return mensagem;
		}
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
		public LocalDateTime getDataCriacao() {
			return dataCriacao;
		}
		public void setDataCriacao(LocalDateTime dataCriacao) {
			this.dataCriacao = dataCriacao;
		}

		public static List<TopicoDto> converter(List<Topico> topicos) {
			return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
			
		}
		
			

	
			
		}

