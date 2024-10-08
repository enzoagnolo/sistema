package com.sesi.atividade.service;

import com.sesi.atividade.model.Pedido;
import com.sesi.atividade.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public void salvarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    public Pedido buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public void mudarStatusPedido(Long id, Pedido.StatusEnum novoStatus) {
        Pedido pedido = pedidoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Pedido inválido: " + id));
        pedido.setStatus(novoStatus);
        pedidoRepository.save(pedido);
    }
}
