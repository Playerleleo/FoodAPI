package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class MainCozinha {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastraCozinha cadastraCozinha = applicationContext.getBean(CadastraCozinha.class);
        Cozinha cozinha1 = new Cozinha();
        Cozinha cozinha2 = new Cozinha();

        cozinha1.setNome("Japonesa");
        cozinha2.setNome("Indiana");

        cadastraCozinha.cadastro(cozinha1);
        cadastraCozinha.cadastro(cozinha2);


//        CadastraCozinha cadastraCozinha = applicationContext.getBean(CadastraCozinha.class);
//
//        List<Cozinha> cozinhas = cadastraCozinha.listar();
//
//        for (Cozinha cozinha : cozinhas) {
//            System.out.println(cozinha.getNome());
//        }

    }
}
