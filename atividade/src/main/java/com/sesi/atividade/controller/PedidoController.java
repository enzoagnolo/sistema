package com.sesi.atividade.controller;

import com.sesi.atividade.model.Pedido;
import com.sesi.atividade.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("pedidos", pedidoService.listarPedidos());
        return "pedidos/lista";
    }

    @PostMapping
    public String salvar(@ModelAttribute Pedido pedido) {
        pedidoService.salvarPedido(pedido);
        return "redirect:/pedidos";
    }

    @PostMapping("/{id}/status")
    public String mudarStatus(@PathVariable Long id, @RequestParam Pedido.StatusEnum status) {
        pedidoService.mudarStatusPedido(id, status);
        return "redirect:/pedidos";
    }
}
