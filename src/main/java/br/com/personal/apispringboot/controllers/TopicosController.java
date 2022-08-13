package br.com.personal.apispringboot.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.personal.apispringboot.dto.TopicoDTO;
import br.com.personal.apispringboot.entities.Curso;
import br.com.personal.apispringboot.entities.Topico;

@RestController
public class TopicosController {
    
    @RequestMapping("/topicos")
    public List<TopicoDTO> getAll(){
        Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programacao"));

        return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
    }
}
