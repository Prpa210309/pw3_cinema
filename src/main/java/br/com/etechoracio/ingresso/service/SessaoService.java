package br.com.etechoracio.ingresso.service;

import br.com.etechoracio.ingresso.entity.Sessao;
import br.com.etechoracio.ingresso.repository.SessaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessaoService {
    private final SessaoRepository repository;

    public SessaoService(SessaoRepository repository){
        this.repository = repository;
    }

    public List<Sessao> listarPorFilme(Long id) {
        return repository.findByFilmeID(id);
    }

}
