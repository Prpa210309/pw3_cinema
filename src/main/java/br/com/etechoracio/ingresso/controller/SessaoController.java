package br.com.etechoracio.ingresso.controller;

import br.com.etechoracio.ingresso.entity.Sessao;
import br.com.etechoracio.ingresso.service.SessaoService;
import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sessoes")

public class SessaoController {

    private final SessaoService service;

    public SessaoController(SessaoService service){
        this.service = service;
    }
    @GetMapping("/filme/{id}")
     public List<Sessao>
    listarPorFilme(@PathVariable Long id) {
        return service.listarPorFilme(id);
     }

}
