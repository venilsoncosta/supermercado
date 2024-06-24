package com.supermercado.supermercado.services;

import com.supermercado.supermercado.entities.Cliente;
import com.supermercado.supermercado.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }
}
