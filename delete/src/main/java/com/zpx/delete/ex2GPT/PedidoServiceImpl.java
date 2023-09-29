package com.zpx.delete.ex2GPT;

import org.springframework.stereotype.Component;

@Component
public class PedidoServiceImpl implements PedidoService {

    @Override
    public String registrarPD() {
        return "registrou o pedido";
    }

    @Override
    public String listarPD() {
        return "lista de pedidos";
    }

    @Override
    public String totalPd() {
        return "total de todos seus pedidos";
    }
}
