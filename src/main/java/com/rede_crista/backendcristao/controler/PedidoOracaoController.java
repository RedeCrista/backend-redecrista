package com.rede_crista.backendcristao.controler;

import com.rede_crista.backendcristao.model.PedidoOracao;
import com.rede_crista.backendcristao.repository.PedidoOracaoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoOracaoController {
    @Autowired
    private PedidoOracaoRepository pedidoRepo;

    @PostMapping
    public ResponseEntity<String> criarPedido(@Valid @RequestBody PedidoOracao pedido) {
        pedidoRepo.save(pedido);
        return ResponseEntity.ok("Pedido de oração enviado com sucesso!");
    }
}
