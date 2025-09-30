package com.example.FinanERP.controller;

import com.example.FinanERP.model.DadosCadastroPagamento;
import org.flywaydb.core.internal.util.JsonUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.ls.LSOutput;

@RestController
@RequestMapping("/pagamentos")
public class PagamentosERP {

    @PostMapping
    public void cadastrarPagamentos(@RequestBody DadosCadastroPagamento pagamento) {
        System.out.println(pagamento);
    }

}
