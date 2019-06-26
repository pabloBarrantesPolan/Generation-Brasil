package org.generation.brazil.loja.controller;


import org.generation.brazil.loja.dao.ClienteDAO;
import org.generation.brazil.loja.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteDAO clienteDAO;

    @RequestMapping("/cliente")
    public List<Cliente> lista(){
        return (List<Cliente>) clienteDAO.findAll();
    }
}
