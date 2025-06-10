package com.rede_crista.backendcristao.controler;

import com.rede_crista.backendcristao.model.Humor;
import com.rede_crista.backendcristao.repository.HumorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/humores")
public class HumorController {
    @Autowired
    private HumorRepository humorRepo;

    @GetMapping
    public List<Humor> listar() {
        return humorRepo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Humor> buscarPorId(@PathVariable Long id) {
        return humorRepo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}