package com.zpx.delete.exGPT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BancoController {

    @Autowired
    private BancoService bancoService;

    public BancoController(BancoService mybanco){
        bancoService = mybanco;
    }

    @GetMapping("/depositar")
    public String getdepositarDinheiro(){
        return bancoService.depositarDinheiro();
    }

    @GetMapping("/sacar")
    public String getsacarDinheiro(){
        return bancoService.sacarDinheiro();
    }

    @GetMapping("/saldo")
    public String getconsultarSaldo(){
        return bancoService.consultarSaldo();
    }
}
