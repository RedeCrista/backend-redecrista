package com.rede_crista.backendcristao.controler;

import com.rede_crista.backendcristao.model.PedidoOracao;
import com.rede_crista.backendcristao.repository.PedidoOracaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoOracaoController {
    @Autowired
    private PedidoOracaoRepository pedidoRepo;

    @PostMapping
    public ResponseEntity<String> criarPedido(@RequestBody PedidoOracao pedido) {
        pedidoRepo.save(pedido);
        return ResponseEntity.ok("Pedido de oração enviado com sucesso!");
    }
}