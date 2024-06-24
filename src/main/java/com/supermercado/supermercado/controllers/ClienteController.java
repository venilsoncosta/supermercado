package com.supermercado.supermercado.controllers;

import com.supermercado.supermercado.entities.Cliente;
import com.supermercado.supermercado.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listar() {
        return clienteService.findAll();
    }
}
