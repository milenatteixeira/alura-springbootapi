package br.com.personal.apispringboot.entities;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

public class Resposta {

	@Getter @Setter private Long id;
	@Getter @Setter private String mensagem;
	@Getter @Setter private Topico topico;
	@Getter @Setter private LocalDateTime dataCriacao = LocalDateTime.now();
	@Getter @Setter private Usuario autor;
	@Getter @Setter private Boolean solucao = false;

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
		Resposta other = (Resposta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
