package br.com.personal.apispringboot.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Topico {

	@Getter @Setter private Long id;
	@Getter @Setter private String titulo;
	@Getter @Setter private String mensagem;
	@Getter @Setter private LocalDateTime dataCriacao = LocalDateTime.now();
	@Getter @Setter private StatusTopico status = StatusTopico.NAO_RESPONDIDO;
	@Getter @Setter private Usuario autor;
	@Getter @Setter private Curso curso;
	@Getter @Setter private List<Resposta> respostas = new ArrayList<>();

	public Topico(String titulo, String mensagem, Curso curso) {
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topico other = (Topico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
