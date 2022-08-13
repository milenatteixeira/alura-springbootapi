package br.com.personal.apispringboot.dto;

import java.time.LocalDateTime;
// import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.personal.apispringboot.entities.Topico;
import lombok.Getter;

public class TopicoDTO {

    @Getter private Long id;
    @Getter private String titulo;
    @Getter private String mensagem;
    @Getter private LocalDateTime dataCriacao;

    public TopicoDTO(Topico topico){
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }

    public static List<TopicoDTO> converter(List<Topico> topicos) {
        // versao a partir do Java 8
        return topicos.stream().map(TopicoDTO::new).collect(Collectors.toList());
    
        // versao antes do Java 8
        // List<TopicoDTO> dtos = new ArrayList<>();
        // for(Topico t : topicos) {
        //         dtos.add(new TopicoDTO(t));
        // }
        // return dtos;
    }
}