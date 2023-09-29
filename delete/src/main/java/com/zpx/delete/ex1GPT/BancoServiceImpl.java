package com.zpx.delete.ex1GPT;

import org.springframework.stereotype.Component;

@Component
public class BancoServiceImpl implements BancoService{
    @Override
    public String depositarDinheiro() {
        return "depositou o dinheiro";
    }

    @Override
    public String sacarDinheiro() {
        return "sacou o dinheiro";
    }

    @Override
    public String consultarSaldo() {
        return "voce consultou o saldo";
    }
}
