package com.zpx.delete.ex2GPT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @Autowired
    private PedidoServiceImpl pedidoServiceImpl;

    /* public PedidoController(PedidoServiceImpl myPedidos){
        pedidoServiceImpl = myPedidos;
    }*/
    
    @Autowired
    public void getPedido(PedidoServiceImpl thePedido){
        pedidoServiceImpl = thePedido;
    }

    @RequestMapping("/registrar")
    public String registrarPD(){
        return pedidoServiceImpl.registrarPD();
    }
    @RequestMapping("/listar")
    public String listarPD(){
        return pedidoServiceImpl.listarPD();
    }
    @RequestMapping("/total")
    public String totalPd(){
        return pedidoServiceImpl.totalPd();
    }
}
