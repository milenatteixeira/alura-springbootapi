package br.com.personal.apispringboot.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.personal.apispringboot.entities.Curso;
import br.com.personal.apispringboot.entities.Topico;

@Controller
public class TopicosController {
    
    @RequestMapping("/topicos")
    @ResponseBody
    public List<Topico> getAll(){
        Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programacao"));

        return Arrays.asList(topico, topico, topico);
    }
}
